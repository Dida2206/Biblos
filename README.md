# Automatizacion-Front-Biblos
Esta es proyecto de prueba para automatizar un smoke test en el front de Biblos.

La estructura principal esta en src/test/java.
Se divide en 4 carpetas principales, steps, runner, pages y resources.

Pages: Contiene la basePage, la cual contiene las clases publicas que se utilizan en todas las pages y a su vez, contiene la configuracion del driver.
Hay una page creada por cada pagina que se utiliza en el script, cada pagina con sus clases privadas y heredando las publicas de la basePage.

Runner: Esta carpea contiene el archivo ejecutable del script con su configuracion necesaria.

Steps: Esta carpeta contiene los pasos a seguir del script y tambien se divide segun la pagina en la que este el script.

Resouces: En esta carpeta se encuentra el archivo "Biblos.feature", el cual tiene seteado los casos de prueba en lenguaje gherkin.

Una vez que se termina de ejecutar el script, se pueden consultar los resultados desde la carpeta test-output/HtmlReport.
