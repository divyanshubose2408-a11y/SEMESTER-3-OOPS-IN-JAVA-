
interface EduMin {
    void followPolicy();
}


interface UGC extends EduMin {
    void grantFunds();
}

interface AICTE extends EduMin {
    void approveTechnicalPrograms();
}

interface Uni extends UGC, AICTE {
    void conductExams();
}


class GGSIPU implements Uni {
    @Override
    public void followPolicy() {
        System.out.println("GGSIPU adheres to national education policies set by EduMin.");
    }

    @Override
    public void grantFunds() {
        System.out.println("GGSIPU allocates funds in accordance with UGC guidelines.");
    }

    @Override
    public void approveTechnicalPrograms() {
        System.out.println("GGSIPU maintains accreditation for AICTE-approved courses.");
    }

    @Override
    public void conductExams() {
        System.out.println("GGSIPU conducts university-level examinations and awards degrees.");
    }
}


public class Main {
    public static void main(String[] args) {
        GGSIPU ipu = new GGSIPU();

        ipu.followPolicy();
        ipu.grantFunds();
        ipu.approveTechnicalPrograms();
        ipu.conductExams();
    }
}
