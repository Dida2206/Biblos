package steps;


    import cucumber.api.java.en.And;
    import cucumber.api.java.en.Given;
    import cucumber.api.java.en.Then;
    import cucumber.api.java.en.When;
    import pages.intranetPage;

public class intranetSteps {

    intranetPage intranet = new intranetPage();
    
    @Given("^Estoy en la intranet$")
    public void ingresarIntra(){
        intranet.ingresarIntra();
        }

    @When("^Ingreso usuario$")   
    public void ingresoUsuario(){
        intranet.clickUsuario("ss44457376");
        }

    @And("^Ingreso contraseña$") 
    public void meLogeo(){
        intranet.clickContraseña();
        intranet.escribirContraseña("intranet");
        }

    @Then("^Logueo a intranet$")
    public void accedoAIntranet(){
         intranet.loguearse();
        }
}

