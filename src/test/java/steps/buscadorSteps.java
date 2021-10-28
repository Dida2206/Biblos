package steps;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.buscadorPage;

public class buscadorSteps {

    buscadorPage buscador = new buscadorPage();

    @Given("^Ingreso url$")
        public void ingresarUrl(){
        buscador.ingresoUrl();  
    }

    @When("^Hago click en ir$")
        public void accederBuscador(){
        buscador.hagoClick();
    }
    
    @And("^Hago una busqueda$")
        public void busqueda(){
        buscador.hacerBusqueda();
    }
    
    @Then("^Accedo al primer resultado$")
        public void accederResultado() throws InterruptedException{
        buscador.accederPagina();   
    }

    @And("^Valido que este un elemento$")
        public void elElementoesta(){
        buscador.navegarPagina();
    }

    @Given("^Ingreso a ayuda$")
    public void ingresarAAyuda(){
        buscador.ingresarAyuda();
        buscador.navegarAyuda();
    }
    
}
