// Clase Principal
public class Main {
    public static void main(String[] args) {

        Crime theft = new Crime("Asalto a mano armada");
        Crime assault = new Crime("Robo");


        Person complainant = new Person("Joaquin Chavarria");
        Person accusedPerson = new Person("Kevin Mejia");
        Person victim = new Person("Joaquin Chavarria");

    
        CaseFile caseFile = new CaseFile("Robo a mano armada");

        caseFile.addComplainant(complainant);
        caseFile.addAccused(accusedPerson, theft);
        caseFile.addVictim(victim, assault);

        System.out.println("Expediente creado el: " + caseFile.getCreationDate());
        System.out.println("Identificador del expediente: " + caseFile.getIdentifier());
        System.out.println("Descripcion del expediente: " + caseFile.getDescription());

        System.out.println("\nDenunciantes:");
        for (Person complainantInCase : caseFile.getComplainants()) {
            System.out.println(" - " + complainantInCase.getName());
        }

        System.out.println("\nDenunciados y Delitos:");
        for (int i = 0; i < caseFile.getAccused().size(); i++) {
            Person accusedInCase = caseFile.getAccused().get(i);
            Crime crimeAccused = caseFile.getCrimesAccused().get(i);
            System.out.println(" - Denunciado: " + accusedInCase.getName() + ", Delito: " + crimeAccused.getName());
        }

        System.out.println("\nOfendidos y Delitos:");
        for (int i = 0; i < caseFile.getVictims().size(); i++) {
            Person victimInCase = caseFile.getVictims().get(i);
            Crime crimeVictim = caseFile.getCrimesVictims().get(i);
            System.out.println(" - Ofendido: " + victimInCase.getName() + ", Delito: " + crimeVictim.getName());
        }
    }
}