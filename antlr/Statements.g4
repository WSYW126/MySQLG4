grammar Statements;


prog   : selectc            # selectcl
       | countc             # countcl	
	   | insertc         # insertcl
	   | deletec         # deletecl
       ;


insertc : INSERT INTO tablename (cidList)? VALUES constant3List
		   ;

selectc : SELECT selectCidList FROM tablename ( wherec ) ? (limitexp) ?
	       ;
	       
deletec : DELETE (selectCidList)? FROM tablename ( wherec ) ?
	       ;
		   
countc : COUNT wherec;


wherec: WHERE conditionc;

conditionc : LB conditionc RB              # conditionwrapper
	| conditionc AND conditionc            # andcondition
	| conditionc OR conditionc             # orcondition
	| cid EQUAL constant                   # equalconstant
	| cid EQUAL var                        # equalvar
	| cid LESS constant                    # lessconstant
	| cid LESS var                         # lessvar
	| cid GREATER constant                 # greaterconstant
	| cid GREATER var                      # greatervar
	| cid LESSEQUAL constant               # lessequalconstant
	| cid LESSEQUAL var                    # lessequalvar
	| cid GREATEREQUAL constant            # greaterequalconstant
	| cid GREATEREQUAL var                 # greaterequalvar
	| cid NOTEQUAL constant                # notequalconstant
	| cid NOTEQUAL var                     # notequalvar
	| cid IN constantList                  # inconstantlist
	| cid IN var                           # invarlist
	| cid NOTIN constantList               # notinconstantlist
	| cid NOTIN var                        # notinvarlist
	| cid BETWEEN constant AND constant    # betweenconstant
	| cid BETWEEN var AND var              # betweenvar
	| cid NOTBETWEEN constant AND constant # notbetweenconstant
	| cid NOTBETWEEN var AND var           # notbetweenvar	
	| cid ISNULL                           # isnullc
	| cid ISNOTNULL                        # isnotnullc
	;




selectCidList : cidList   # cidList_CidList
			  | STAR      # cidList_Star
			  | TEXT      # cidList_Regx
	     	  ;
	
cidList : LB cid (',' cid) * RB ;
cid : TEXT ;


constantList  : LB constant ( ',' constant) * RB ;
constant2List : LB constant2 ( ',' constant2) * RB ;
constant3List : LB constant2 ( ',' constant2) * RB (',' LB constant2 ( ',' constant2) * RB) * ;

constant2: constant               # constant2_NotNull
         | NULL                   # constant2_Null
		 ;
		 

limitexp : LIMIT TEXT ( ',' TEXT)?
		 ;

		 
		 
tablename : TEXT ;	
constant: '"' TEXT '"';
var : '#' TEXT '#' ;


STAR : '*' ;

LB : '(' ;
RB : ')' ;

WHERE : 'where' ;	

SELECT : 'select' ; 
COUNT  : 'count' ;
COUNTSUM  : 'countsum' ;
INSERT : 'insert' ;
DELETE : 'delete' ;
INTO   : 'into' ;
VALUES : 'values' ;
FROM   : 'from' ;

LIMIT : 'limit' ;


TS : 'ts' ;
STARTTS : 'startTS' ;
ENDTS : 'endTS' ;

IS : 'is' ;
NULL : 'null';
NOT : 'not';

AND : 'and' ;
OR : 'or' ;


LESSEQUAL : ('lessequal'|'<=') ;
LESS : ('less'|'<') ;

GREATEREQUAL : ('greaterequal'|'>=');
GREATER: ('greater'|'>') ;

NOTEQUAL : ('notequal'|'!=') ;
EQUAL : ('equal'|'=') ;


IN : 'in' ;
NOTIN : 'notin' ;

BETWEEN : 'between' ;
NOTBETWEEN : 'notbetween' ;

ISNULL : 'isnull' ;
ISNOTNULL : 'isnotnull' ;

TEXT :  [a-zA-Z0-9_:<[{\\^\-=$!|\]}?*+.>]+ ;

WS  :   [ \t\r\n]+ -> skip ; // toss out whitespace