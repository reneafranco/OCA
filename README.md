# OCA

--OCA JP1



-- 12 meses -- 4 Ciclos - 3 Subciclos - 4 capitulos - 5 Sub Topics

-- Cliclo # 1

    - Sacar la Certificacion de Oracle Java Associate Programmer

    - Quiero Mejorar mis Skills de Spring Boot

   
    - test




    --- Oracle Java Associate Programer.

        - el examen cuenta de 8 modulos, Puedo dividir cada modulo por semana ,
        tardandome 2 meses de esa manera

        - puedo dejar el otro mes para concentarme en los examenes de prueba,
        y puliendo los detalles.

        - 2 meses estudiando conceptos , cada modulo por semana y el ultimo mes
        solo examenes de prueba


     ---   Modulos

           @Semana 1
           1 - Java Basic.

            -- Estructura de Una clase
            (Una clase puede tener atributos (Variables ) y behaviors (Methodos )
            Java Automaticamente Crea un constructor por ti sin args pero una vez que defines un
            constructor , tienes que implementar en costructor sin args xq Java lo Elimina el que creo.

            el metodo main es obligado para que la aplicaciojn funcione , ya que JVM nesecita un lugar por donde
            empezar a correr el programa, el public del main method es xq nesecita ser publico ya que JVM va a
            acceder a el tambien tiene que ser static para que el JVM pueda acceder a el sin tener que crear
            una instancia del objecto , void xq el main method no puede devolver nada , y tiene que llamarse
            main , en minuscula y escrito de esa manera.

            el methodo main recive un Array de String , que puede ser asi // main(String... args[])
            o asi main(String[] args) que no es que los input que le pases al programa , si quieres pasarle
            input al programa y puedes acceder a elos en args[0];

            --POINTERS
            - Los Objecto son instancias corriendo de una clase
            - Una Clase no puede hacer nada sin un objeto
            - Los constructores son una especie especial de methodos usados para crear objectos y no tienen ningun tipo de 
            return type (ni siquiera void) 
            - Los constructores corren despues que todos los campos (fields ) e instancias de blokes {} hallan corrido.


            Los features de Java
            -- Plataforma independiente , quiere decir que no imporat la plataforma que uses (ya sea linux, Windows ,
            o MacOs) siempre el programa va a funcionar simepre y cuando el JVM este installado o corriendo

            --Object Oriented -- Una filosofia que permite disenar, planear y programar en base a modelos de la vida real

            -- Permite Crear Robustas aplicaciones 



           @Semana 2
           2 - Working With Java Data Types


             - Java Tiene 8 tipos de datos
                - Byte 
                - Short
                - int 
                - long
                - float         1.0f
                - double 
                - char 
                - boolean


            - Java soporta 
                - Octal que son dijitos de 0 - 7 
                - Hexadecimal - digitos de 0- 9 , tambien soporta letras de de la A - F
                (En el examen no te van a pedir convertir el tipo de datos pero si te va a pedir que los reconozcas) 
                ejemplo de hexadecimal 0xFF , es un digito seguido por una x minuscula y luego letras mayusculas de la A - F
               
                - Binario son digitos de 0 - 1, ejemplo 0b10 , es un digito seguido de b minusculo y luego 10 o 11 


                nota: en java puedes separar los numeros con un _ para hacerlos mas facil de leer y java solo los ignora 
                - ejemplo : int number = 500_00_99
                java lo lee como 5000099 / no se puede tener el _ al principio / al final o despues un punto decimal
                -- double notAtStart = _1000.00 // does not compile / el _ no puede estar al principio 
                -- double notAtEnd = 100.00_; // el _ no puede estar al final 
                -- double decimal = 1_.01; // el _ no puede esatr antes o despues de un punto  decimal 


            ---Reference Types

            - Primitives data types store the actual value 
            - Reference Types sore the memory address which point to an object

            -- Srting s1, s2 se puede declarar incluso inicializar multiples variabls en la misma linea separdas por coma , 
            y siempre y cuando sean del mismo tipo 

            -- Identifiers
            -- Rules
                - Las reglas aplican para las variables , Methodos, fields etc.

                - El nombre debe comenzar con una letra o el simbolo $ o _

                - Subsequencias de caracteres tambien son considerados numeros 

                - No puedes usar las palabras resrvadas de Java , y recuerda que java es Case sensitive 

                -- Valid
                 $OkValid
                 _alsoOkIndetifiers
                 __stillOkButDontUseIt

                 -- NOt Valid 
                    - 3DPrinter // no puede empezar por numeros 
                    - hollywodd@dd // no pueden contener caracterez especiales 
                    - *$coffe //  no puedes usar * el unico simbolo que se puede usar al principio solo $


                    --En Java se una convencion para nombrar identifiers llamada Camel Casing

                    // los methodos y variables empiezan con una letra minuscula y la siguente palabra mayuscula
                    -- int numbersOfEggs

                    // las nombres de las clases empiezan con letra Mayuscula 
                        -- class MyClass

                -- Local Variable 
                - Una variable local es una variable definida dentro de un methodo
                - Una variable local debe ser inicializada antes de usarse 
                - No tienen valor por default y solo contiene datos basura hasta que se inicia 
                
                -- Class Variables o Instance variables o fields 
                    - Class variable son compartidas a traves de varios objetos y tiene la palabra static delante 
                    // statint int num = 6; // Class Variable

                    // int nums = 5; // Instance variable
                    - No es obligatorios inicializar ningun tipo de estas variables , tan pronto como son creados 
                    java les da un default value 


            -----Scope Of Variables ----
            -- Local Variables - las variables estan en scope of the particular method where its declared (dentro de un
            methodo o blocke the codigo )
            -- Instance variables - they Stay in scope till the ibject exists ( dentro de una clase )
            -- class variables - they stay in scope till the programs ends ( static variables )


            -- Orden De los Elementos 
            PIC - Package, Import , Class 

           la plabra new te devuelve una nueva instancia del objecto, los objetos(Wrapper Class) son diferentes
                       a los primitives data types ya que cuando le assignas el valor a un datop primitivo el valor se
                       almacena en el stack mientras que cuando creas un objecto creas una variable referencia que va a
                       estar en la memoria stack y va apuntando a donde esta el objecto en heap memory.

                       El Garbage Collector funciona que de manera que va buscando por la memoria objetos que no tenga
                       una referencia desde la Stack Memory y asi los eliminas , puedes hacer seguimientos de ciertos objectos
                       que vas a borrar  con la funcion finalize() la override y ya eso solo funciona hasta java 9, despues
                       de java 9 se usa la funcion cleaner , que lo que hace es forzar el garbage collection sobre un objecto
                       cuando se lo indicas .


           @Semana 3
           3 - Using Operators and Decision Constructs
           
            -Understanding Java Operators
            - A java operator is a especial symbol that can be applied to a set oof variables, values or literals
            and that return a result

            example : int sum = a + b; // a and b are operands andthe + is the operator itself.
           

            
           - Working with Binary Aritrhmetic Operatos 
           
            example : 
            int y = 4;
            double x = 3 + 2 * --y;
            
           - Java Follows something call operators precedence , that basicly says that some operator has priority over 
           other operators ,  Whats the Value of x ? 
           
            double x = 3 + 2 * --y;
            // en el background tiene este orden 
            --/ ++ (--y)delante de una variable se llama prefix y lo que hace es que antes de que la sentencia se ejecute 
            le resta o suma 1 a la variable primero. 
            --/++ (y--)despues de la variable es llamado postfix , y lo que quiere decir es que despues que termine la                 operacion sume o reste 1 a la variable 

            double x =  3 + ( 2* (--y)); // ese es el orden que java seguir para ejecutar la sentencia 

            los prefix se ejecutan primero que la sentencia // y - 1 = 3;
            division , sume o modulo (? * % ) tienen mayor precedence que +/- // luego de restarle el valor a y lo * 2 ;
            // luego de la multiplicacion solo queda sumar 3;

            los Prefix( Pre-unary operators ) ++expression/ --expression
            los PostFix( Post-unary operators ) expression++/ expression--

            Nota: si hay parentesis esa consulta se ejecuta primero 
            
            tienen mas precedence que los 
            / division * mutiplicacion / % modulo

            y los ultimos 
            + suma - resta

                
                int i = 10;
               int x = 10 > 2 ? i + 5 : i - 2;

               int x = ( 10 > 2) ? (i + 5) : (i - 2);
                // puede tener hasta 2 condiciones.
                
            - Using Additional Binary Operators 
            - Understanding Java Statements
            -Understending Advance Flow control 
            - Summary and Review Question


            keep on mid waht is each operator for 

            int y = 10/5 // its return te question / 2 
            int x = 10%5 // its return the remainder / 0


            --- Numeric promotion
            --Numeric Promotions rules 

            1 - If two values have different data types , Java will automatically promote one of the values to the 
            larger of the two data types.

            2 - If one of the values is integral and the other is floating-point , java will automatically promote the 
            integral value to the floating-point value data type . ( Si comparas un int con un float java convierte en int 
            en float automatico / mismo con doubles )

            3 - Smaller data types , byte, short and char are first promoted to int any time tehy are used with java
            arithmetic operator . ( es decir que si cuando declares el valor de un short/byte/char y uses algun operador 
            articmetico en la declaracion el resultado siemppre viene en int , asi que necesitas hacer un casting )

            4 - After all promotions has occurred and the operands have the same data type , the resulting value will 
            have the same data type as promoted the operans. (es decir si todos los operands fueron promovidos a double 
            por ejemplo , al final el resultao va a ser un double 

           @Semana 4
           4 - Creating and Using Arrays


           @Semana 5
           5 - Using Loop Constructs


           @Semana 6
           6 - Working with Methods and Encapsulation

           @Semana 7
           7 - Working with Inheritance

           @Semana 8
           8 - Working with Selected Classes from the Java Api


         -- Recursos
            - Online Course
            - OCA Book $
            - Enthuware Software 




    ---- Mejorar mis skills con Spring Boot

        - Puedo dividir cada mes para cubrir un tema en especifico

        @Mes 1
        1 - Basic Level


         ### Mes 1: Proyecto Básico - Gestor de Tareas

         #### Semana 1-2:
         - **Estudio: Fundamentos de Spring Boot**
           - Comprender los principios fundamentales de Spring Boot.
           - Explorar la arquitectura de Spring Boot.
           - Estudiar la estructura de un proyecto Spring Boot.

         - **Estudio: Estructura de un proyecto Spring Boot**
           - Investigar la organización de un proyecto Spring Boot.
           - Entender la importancia de las anotaciones y su aplicación.

         - **Proyecto: Configuración inicial del proyecto**
           - Crear un proyecto Spring Boot desde cero.
           - Configurar las dependencias necesarias para el proyecto.

         - **Proyecto: Desarrollar operaciones CRUD básicas**
           - Implementar las operaciones básicas de Crear, Leer, Actualizar y Eliminar (CRUD).
           - Utilizar anotaciones de Spring para facilitar el desarrollo.

         - **AWS: Configuración inicial de Amazon RDS**
           - Crear una instancia de Amazon RDS para la persistencia de datos.
           - Configurar la conexión del proyecto Spring Boot con Amazon RDS.

         - **AWS: Explorar conceptos básicos de Amazon RDS**
           - Entender temas como configuración de bases de datos, seguridad y escalabilidad en Amazon RDS.

         #### Semana 3-4:
         - **Estudio: Persistencia de datos con Spring Data JPA**
           - Profundizar en el uso de Spring Data JPA para la persistencia de datos.
           - Aprender a mapear entidades y realizar consultas.

         - **Proyecto: Integrar persistencia para las tareas**
           - Aplicar Spring Data JPA en el proyecto de gestor de tareas.
           - Asegurarse de que las tareas se almacenen de manera persistente.

         - **AWS: Explorar opciones avanzadas de configuración en Amazon RDS**
           - Investigar características avanzadas de Amazon RDS, como la replicación y los snapshots.


        @Mes 2
        2 - Intermedio level


        ### Mes 2: Proyecto Intermedio - API de Blog

        #### Semana 5-6:
        - **Estudio: Construcción y consumo de APIs REST con Spring Boot**
          - Explorar cómo construir APIs REST con Spring Boot.
          - Entender los principios de diseño de una buena API REST.

        - **Estudio: Implementar seguridad básica**
          - Comprender los conceptos de seguridad en una aplicación Spring Boot.
          - Implementar seguridad básica en la API del blog.

        - **Proyecto: Diseñar la estructura de la API del blog**
          - Definir los endpoints y la estructura general de la API.
          - Utilizar anotaciones de seguridad para proteger ciertos recursos.

        - **Proyecto: Agregar autenticación básica**
          - Implementar autenticación básica en la API utilizando Spring Security.
          - Conectar la autenticación con servicios como Amazon Cognito.

        - **AWS: Configurar servicios como Amazon Cognito para autenticación**
          - Crear un pool de usuarios en Amazon Cognito.
          - Integrar la autenticación de la API con Amazon Cognito.

        - **AWS: Explorar conceptos básicos de Amazon Cognito**
          - Entender cómo Amazon Cognito gestiona la identidad y el acceso.

        #### Semana 7-8:
        - **Estudio: Pruebas unitarias y de integración en Spring Boot**
          - Aprender sobre las pruebas unitarias y de integración en el contexto de Spring Boot.
          - Utilizar herramientas de prueba como JUnit y Mockito.

        - **Proyecto: Agregar pruebas para las funciones principales de la API**
          - Escribir pruebas unitarias para los controladores y servicios.
          - Realizar pruebas de integración para asegurar el correcto funcionamiento.

        - **Proyecto: Desarrollar una interfaz de usuario simple**
          - Crear una interfaz de usuario básica para interactuar con la API.
          - Utilizar frameworks de frontend como Thymeleaf, Angular o React.

        - **AWS: Configurar y utilizar servicios de almacenamiento como Amazon S3**
          - Configurar un bucket de Amazon S3 para almacenar archivos estáticos.
          - Introducir el manejo de archivos en la interfaz de usuario.

        - **AWS: Explorar conceptos básicos de Amazon S3**
          - Comprender cómo Amazon S3 se utiliza para el almacenamiento de objetos.


        @Mes 3
            3 - Advance Level

        ### Mes 3: Proyecto Avanzado - Plataforma de Microservicios

        #### Semana 9-10:
        - **Estudio: Introducción a los microservicios y Spring Cloud**
          - Comprender los conceptos fundamentales de la arquitectura de microservicios.
          - Introducción a Spring Cloud para facilitar el desarrollo de microservicios.

        - **Estudio: Comunicación básica entre microservicios**
          - Aprender cómo los microservicios se comunican entre sí.
          - Utilizar herramientas de Spring Cloud para facilitar la comunicación.

        - **Proyecto: Crear servicios independientes para funcionalidades específicas**
          - Desarrollar microservicios separados para diferentes funcionalidades.
          - Utilizar la comunicación básica entre microservicios.

        - **Proyecto: Implementar comunicación simple entre servicios**
          - Configurar la comunicación entre los microservicios.
          - Implementar llamadas de servicio entre los componentes.

        - **AWS: Configurar servicios como Amazon ECS para desplegar microservicios en contenedores**
          - Configurar un clúster de Amazon ECS para desplegar microservicios.
          - Crear definiciones de tareas y servicios en Amazon ECS.

        - **AWS: Explorar conceptos básicos de Amazon ECS**
          - Entender cómo Amazon ECS gestiona el despliegue y escalado de contenedores.

        #### Semana 11-12:
        - **Estudio: Despliegue de microservicios en contenedores (Docker)**
          - Aprender sobre la contenerización de aplicaciones con Docker.
          - Configurar imágenes Docker para los microservicios.

        - **Estudio: Estrategias básicas de despliegue y gestión**
          - Comprender las estrategias de despliegue y gestión de microservicios.
          - Explorar conceptos como rolling deployments y canary releases.

        - **Proyecto: Preparar los servicios para el despliegue en contenedores**
          - Optimizar los microservicios para ser desplegados en contenedores.
          - Implementar estrategias de despliegue básicas.

        - **Proyecto: Desplegar y gestionar los microservicios en un entorno de contenedores**
          - Desplegar los microservicios en el clúster de Amazon ECS.
          - Gestionar y monitorizar los servicios en ejecución.

        - **AWS: Implementar estrategias de despliegue con servicios de balanceo de carga como Amazon ELB**
          - Configurar un balanceador de carga en Amazon ELB.
          - Implementar estrategias de despliegue con balanceo de carga.

        - **AWS: Explorar opciones avanzadas de configuración en Amazon ECS**
          - Investigar opciones avanzadas de configuración y gestión en Amazon ECS.

Hi 
Voy a darte un rapido vistaso de mis metas y lo que he hecho hasta ahora 

Lo primero es definir cuales son mis goals, 

    * Conseguir un trabajo como desarrollador de Software 
    
    * Completar mi Bachelors Degree 
    (
    * Convertirme en un mejor desarrollor de software 
    ( 

    lo que he echo hasta ahora y los planes que tengo a futuro 
    - Para conseguir trabajo he  trabajado en mis skills , mejore mi resumen , me he preparado para entrevistas conto tecnicas, como de 
    comportamiento , he comenzado a hacer networking , y tambien ha desarrollar mi marca personal , como un canal de youtube y mas activos en redes 
    como linkind.
     
    - En cuanto a completar el bacherlos he considerado varias universidades pero encontre una que tiene el programa que quiero y aunque se que me va a 
    tomar tiempo, es un objetivo que con esfuerzo puedo sacarme el titulo en un periodo de 1.5 - 2 anos. Tambien he investigado mucho sobre el programa 
    que quiero hacer el cual es bachelors of Science , Software Development , y tengo una ruta de aprendizaje para optimizar mi tiempo y recursos.

    - Para convertirme en un mejor desarollador me he preorizado en  pulir mis skills y probar proyectos de todo tipo saliendo de mi sona de confort 
    y tratando cosas nuevas ,Tambien me estoy preparando para pasar Oracle Java Certifications el OCA que aunque la mayor razon por la que voy 
    a sacar la certificacion es para agregarla al resumen y me convalida 2 clases en la universidad, tambien me mantengo resolviendo ejercicios 
    de Leetcode / HackerRank ,mayormente para preparme para entrevistas pero tambien para entender nuevos algoritmos y formas de optimizar mi codigo 


    Donde me veo a futuro 

    Si bien estoy tratando de conseguir un trabajo como desarrollador Java porque es un lenguaje sencillo y facil de trabajar , la mayor razon es que 
    me gusta trabajar mas en el backend / server / cloud parte del programa , quizas en futuro pueda desarrollar en la nube o quien sabe , yo veo los 
    cambios como oportunidades , que puedo aprovechar para aprender algo nuevo y eso es lo que me motiva a querer siempre mejorar. 

    Pasos que voy a tomar a partir de ahora 

    Actualemnte tengo plan de estudio donde he divido el ano en 4 ciclos de 3 meses , y en cada ciclo tener un objetivo en especifico 
    Ahora me estoy preparando para tomar el OCA exam, si puedo pasarlo me imagino que el proximo cilco ire por OCJP , ya que pienso 
    enrollar en la universidad para mitad de ano mas o menos. Seguir estudiando y mientras lo hago seguir creando proyectos , hacer networking 
    y seguir . Se que nada por si solo me puede garantizar un trabajo pero trato de con cada cambio mejorar mis posibilidades , ademas 
    si algo tengo en claro es que para lograr los objetivos cuesta tiempo y esfuerzo, asi que me tome 1 mes o me tome 2 anos consguir el trabajo 
    lo que quiero es mantenerme consistente 

    Quiero aprovechar la oportunidad para dartte las gracias por la ayuda , ya que la verdad le tengo mucho respeto y me siento honrado de tener de ayuda 
    de una persona tan experimentada como usted 

