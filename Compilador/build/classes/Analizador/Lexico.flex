package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+                   
D=[0-9]+         
espacio=[ \t\r]+
%{
    public String lexemas;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

(try)
(catch)

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Comilla_Simple */
( "'" ) {lexemas=yytext(); return Comilla_Simple;}

/* Dos_puntos */
( ":" ) {lexemas=yytext(); return Dos_puntos;}

/* Tipo de dato Double */
( double ) {lexemas=yytext(); return Double;}

/* Tipo de dato Float */
( float ) {lexemas=yytext(); return Float;}

/* Tipo de dato Long */
( long ) {lexemas=yytext(); return Long;}

/* Tipo de dato Char */
( char ) {lexemas=yytext(); return Char;}

/* Tipo de dato Byte */
( byte ) {lexemas=yytext(); return Byte;}

/* Tipo de dato Int */
( int ) {lexemas=yytext(); return Int;}

/* Tipo de dato Void */
( void ) {lexemas=yytext(); return Void;}

/* Tipo de dato String */
( string ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Return */
( return ) {lexemas=yytext(); return Return;}

/* Palabra reservada System */
( system ) {lexemas=yytext(); return Sistema;}

/* Palabra reservada Pause */
( pause ) {lexemas=yytext(); return Pause;}

/* Palabra reservada Scanf */
( scanf ) {lexemas=yytext(); return Scanf;}

/* Palabra reservada Include */
( #include ) {lexemas=yytext(); return Include;}

/* Palabra reservada Define */
( #define ) {lexemas=yytext(); return Define;}

/* Palabra reservada Struct */
( struct ) {lexemas=yytext(); return Struct;}

/* Palabra reservada Register */
( register ) {lexemas=yytext(); return Register;}

/* Palabra reservada Union */
( union ) {lexemas=yytext(); return Union;}

/* Reservada Using namespace std */
( "using namespace std" ) {lexemas=yytext(); return Using;}

/* Reservada Cin */
( cin ) {lexemas=yytext(); return Cin;}

/* Reservada Cout */
( cout ) {lexemas=yytext(); return Cout;}

/* Reservada Switch */
( switch ) {lexemas=yytext(); return Switch;}

/* Reservada Case */
( case ) {lexemas=yytext(); return Case;}

/* Reservada Default */
( default ) {lexemas=yytext(); return Default;}

/* Reservada Break */
( break ) {lexemas=yytext(); return Break;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

/* Op_And */
( "&&" ) {lexemas=yytext(); return Op_And;}

/* Op_Or */
( "||" ) {lexemas=yytext(); return Op_Or;}

/* Op_Not */
( "!" ) {lexemas=yytext(); return Op_Not;}

/* Op_And bit a bit */
( "&" ) {lexemas=yytext(); return Op_And_BaB;}

/* Op_Or bit a bit */
( "|" ) {lexemas=yytext(); return Op_Or_BaB;}

/* Op_Not bit a bit */
( "~" ) {lexemas=yytext(); return Op_Not_BaB;}

/* Op_Xor bit a bit */
( "^" ) {lexemas=yytext(); return Op_Xor_BaB;}

/*Operador MayorQue */
( ">" ) {lexemas = yytext(); return Mayorque;}

/*Operador MenorQue */
( "<" ) {lexemas = yytext(); return Menorque;}

/*Operador Igual a */
( "==" ) {lexemas = yytext(); return Igual_a;}

/*Operador diferente de */
( "!=" ) {lexemas = yytext(); return Diferente;}

/*Operador Mayor_Igual */
( ">=" ) {lexemas = yytext(); return Mayor_Igual;}

/*Operador Menor_Igual */
( "<=" ) {lexemas = yytext(); return Menor_Igual;}

/*Operador Desplazamiento_Izq */
( "<<" ) {lexemas = yytext(); return Desplazamiento_Izq;}

/*Operador Desplazamiento_Der */
( ">>" ) {lexemas = yytext(); return Desplazamiento_Der;}

/* Operador asigna suma */
( "+=" ) {lexemas = yytext(); return Op_asig_suma;}

/* Operador asigna resta */
( "-=" ) {lexemas = yytext(); return Op_asig_resta;}

/* Operador asigna multiplicacion */
( "*=" ) {lexemas = yytext(); return Op_asig_multiplicacion;}

/* Operador asigna division */
( "/=" ) {lexemas = yytext(); return Op_asig_division;}

/* Operador asigna modulo */
( "%=" ) {lexemas = yytext(); return Op_asig_modulo;}

/* Operador Incremento */
( "++" ) {lexemas = yytext(); return Op_incremento;}

/* Operador Decremento */
( "--" ) {lexemas = yytext(); return Op_decremento;}

/*Reservada True*/
( true )      {lexemas = yytext(); return True;}

/*Reservada False*/
( false )      {lexemas = yytext(); return False;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {lexemas=yytext(); return Printf;}

/* Punto y coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Coma */
 (",")  {lexemas=yytext(); return Coma;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

