package Analizador;
import java_cup.runtime.Symbol;
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%


/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Comilla_Simple */
( "'" ) {return new Symbol(sym.Comilla_Simple, yychar, yyline, yytext());}

/* Dos_puntos */
( ":" ) {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}

/* Tipo de dato Double */
( double ) {return new Symbol(sym.Double, yychar, yyline, yytext());}

/* Tipo de dato Float */
( float ) {return new Symbol(sym.Float, yychar, yyline, yytext());}

/* Tipo de dato Long */
( long ) {return new Symbol(sym.Long, yychar, yyline, yytext());}

/* Tipo de dato Char */
( char ) {return new Symbol(sym.Char, yychar, yyline, yytext());}

/* Tipo de dato Byte */
( byte ) {return new Symbol(sym.Byte, yychar, yyline, yytext());}

/* Void */
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Tipo de dato Int */
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Palabra reservada Printf */
( printf ) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Palabra reservada Return */
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Palabra reservada System */
( system ) {return new Symbol(sym.Sistema, yychar, yyline, yytext());}

/* Palabra reservada Pause */
( pause ) {return new Symbol(sym.Pause, yychar, yyline, yytext());}

/* Palabra reservada Include */
( #include ) {return new Symbol(sym.Include, yychar, yyline, yytext());}





/* Palabra reservada Define */
( #define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

/* Palabra reservada Struct */
( struct ) {return new Symbol(sym.Struct, yychar, yyline, yytext());}

/* Palabra reservada Register */
( register ) {return new Symbol(sym.Register, yychar, yyline, yytext());}

/* Palabra reservada Union */
( union ) {return new Symbol(sym.Union, yychar, yyline, yytext());}




/* Reservada Using namespace std */
( "using namespace std" ) {return new Symbol(sym.Using, yychar, yyline, yytext());}

/* Reservada Scanf */
( scanf ) {return new Symbol(sym.Scanf, yychar, yyline, yytext());}

/* Reservada Cin */
( cin ) {return new Symbol(sym.Cin, yychar, yyline, yytext());}

/* Reservada Cout */
( cout ) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

/* Reservada Switch */
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/* Reservada Case */
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

/* Reservada Default */
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

/* Reservada Break */
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}



/* Op_And */
( "&&" ) {return new Symbol(sym.Op_And, yychar, yyline, yytext());}

/* Op_Or */
( "||" ) {return new Symbol(sym.Op_Or, yychar, yyline, yytext());}

/* Op_Not */
( "!" ) {return new Symbol(sym.Op_Not, yychar, yyline, yytext());}

/* Op_And bit a bit */
( "&" ) {return new Symbol(sym.Op_And_BaB, yychar, yyline, yytext());}

/* Op_Or bit a bit */
( "|" ) {return new Symbol(sym.Op_Or_BaB, yychar, yyline, yytext());}

/* Op_Not bit a bit */
( "~" ) {return new Symbol(sym.Op_Not_BaB, yychar, yyline, yytext());}

/* Op_Xor bit a bit */
( "^" ) {return new Symbol(sym.Op_Xor_BaB, yychar, yyline, yytext());}




/*Operador Mayorque */
( ">" ) {return new Symbol(sym.Mayorque, yychar, yyline, yytext());}

/*Operador Menorque */
( "<" ) {return new Symbol(sym.Menorque, yychar, yyline, yytext());}

/*Operador Igual a */
( "==" ) {return new Symbol(sym.Igual_a, yychar, yyline, yytext());}

/*Operador Diferente */
( "!=" ) {return new Symbol(sym.Diferente, yychar, yyline, yytext());}

/*Operador Mayor_Igual */
( ">=" ) {return new Symbol(sym.Mayor_Igual, yychar, yyline, yytext());}

/*Operador Menor_Igual */
( "<=" ) {return new Symbol(sym.Menor_Igual, yychar, yyline, yytext());}

/*Operador Desplazamiento_Izqu */
( "<<" ) {return new Symbol(sym.Desplazamiento_Izq, yychar, yyline, yytext());}

/*Operador Desplazamiento_Der */
( ">>" ) {return new Symbol(sym.Desplazamiento_Der, yychar, yyline, yytext());}





/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operador asigna suma */
( "+=" ) {return new Symbol(sym.Op_asig_suma, yychar, yyline, yytext());}

/* Operador asigna resta */
( "-=" ) {return new Symbol(sym.Op_asig_resta, yychar, yyline, yytext());}

/* Operador asigna multiplicacion */
( "*=" ) {return new Symbol(sym.Op_asig_multiplicacion, yychar, yyline, yytext());}

/* Operador asigna division */
( "/=" ) {return new Symbol(sym.Op_asig_division, yychar, yyline, yytext());}

/* Operador asigna modulo */
( "%=" ) {return new Symbol(sym.Op_asig_modulo, yychar, yyline, yytext());}








/* Operador Incremento*/
( "++" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}


/* Operador decremento */
( "--" ) {return new Symbol(sym.Op_decremento, yychar, yyline, yytext());}









/*Reservada True*/
( true ) {return new Symbol(sym.True, yychar, yyline, yytext());}

/*Reservada False*/
( false ) {return new Symbol(sym.False, yychar, yyline, yytext());}





/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parent_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parent_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Coma */
 (",") {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}

