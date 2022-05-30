package clase;

public interface IPachetTuristic {
    public boolean poateRezerva();

    public void aplicaDiscountVarstnici(int procent);

    public Double getPret();
}


//Dummy object – un obiect care respecta interfața dar metodele nu fac nimic sau null.
//Stub – Spre deosebire de Dummies, metodele dintr-un Stub vor întoarce răspunsuri conservate / hardcodate.
//Fake – este un obiect care se comportă asemănător cu unul real, dar are o versiune simplificată.

//Custom TestSuite
//În cazul de față se include o singură categorie de teste. Testele din
//această categorie se regăsesc în două TestCase-uri CompanyTest și PersonTest:


