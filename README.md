# OCA

--OCA JP1



-- 12 meses -- 4 Ciclos - 3 Subciclos - 4 capitulos - 5 Sub Topics

-- Cliclo # 1

    - Sacar la Certificacion de Oracle Java Associate Programmer

    - Quiero Mejorar mis Skills de Spring Boot

   





    --- Oracle Java Associate Programer

        - el examen cuenta de 8 modulos, Puedo dividir cada modulo por semana ,
        tardandome 2 meses de esa manera

        - puedo dejar el otro mes para concentarme en los examenes de prueba,
        y puliendo los detalles.

        - 2 meses estudiando conceptos , cada modulo por semana y el ultimo mes
        solo examenes de prueba


     ---   Modulos

           @Semana 1
           1 - Java Basic

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




    ---- Mejorar mis skills con Spring Boot

        - Puedo dividir cada mes para cubrir un tema en especifico

        @Mes 1
        1 - Basic Level

         ¡Entendido! Aquí tienes un desglose más detallado de las fases de estudio para cada semana:

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

        ¡Por supuesto! Aquí tienes un desglose más detallado de las fases de estudio para cada semana en cada mes:

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



