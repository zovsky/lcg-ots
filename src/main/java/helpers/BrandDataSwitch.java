package helpers;

public class BrandDataSwitch {

    public static String getSchoolPageURL() {
        switch (TestConfig.domain)
        {
            case "tutortime.com":
                return  "/your-local-school/colleyville-tx-6579"; //both
            case "pathwayslearningacademy.com":
                return "/your-local-school/9301-pla-northview-church/"; //virtual
            case "montessori.com":
                return "/montessori-schools/houston-tx-7345"; //both
            case "lapetite.com":
                return "/your-local-school/austin-tx-7529"; //both
            case "everbrookacademy.com":
                return "/our-schools/chicago-il-4809"; //both
            case "creativekidslearningcenter.com":
                return "/schools/las-vegas-nv-6701"; //both
            case "childtime.com":
                return "/your-local-school/lewisville-tx-1204"; //both
            case "childrenscourtyard.com":
                return "/your-local-school/arlington-tx-3003"; //both
            case "u-gro.com":
                return "/your-local-school/4832-u-gro-of-lititz-pa"; //both
            case "learningcaregroup.com":
                return ""; //todo
            default:
                return "Error: no brand";
        }
    }

    public static String getEmailAddress() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "TTVALID@EXAMPLE.COM";
            case "pathwayslearningacademy.com":
                return "PLAVALID@EXAMPLE.COM";
            case "montessori.com":
                return "MUVALID@EXAMPLE.COM";
            case "lapetite.com":
                return "LPAVALID@EXAMPLE.COM";
            case "everbrookacademy.com":
                return "EAVALID@EXAMPLE.COM";
            case "creativekidslearningcenter.com":
                return "CKVALID@EXAMPLE.COM";
            case "childtime.com":
                return "CTVALID@EXAMPLE.COM";
            case "childrenscourtyard.com":
                return "CCYVALID@EXAMPLE.COM";
            case "u-gro.com":
                return "UGVALID@EXAMPLE.COM";
            default:
                return "";
        }
    }

    public static String getStep4ExpectedText() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "Tutor Time of Austin, TX";
            case "pathwayslearningacademy.com":
                return "Pathways Learning Academy of Indianapolis, IN";
            default:
                return "Error: no brand";
        }
    }

    public static String getStep5ExpectedText() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "To confirm and schedule your Tutor Time of Austin, TX";
            case "pathwayslearningacademy.com":
                return "To confirm and schedule your ";
            default:
                return "Error: no brand";
        }
    }

    public static String getFYSResultsPageURL() {
        switch (TestConfig.domain)
        {
            case "tutortime.com":
                return  "/child-care-centers/find-a-school/search-results/?state=MN";
            case "pathwayslearningacademy.com":
                return "/locations";
            case "montessori.com":
                return "/montessori-schools/find-a-school/search-results/?state=GA"; //todo search for state where A is clickable on the map on all envs
            case "lapetite.com":
                return "/child-care-centers/find-a-school/search-results/?state=OR";
            case "everbrookacademy.com":
                return "/our-schools/chicago-il-4809"; //both todo
            case "creativekidslearningcenter.com":
                return "/schools/las-vegas-nv-6701"; //both todo
            case "childtime.com":
                return "/your-local-school/lewisville-tx-1204"; //both todo
            case "childrenscourtyard.com":
                return "/your-local-school/arlington-tx-3003"; //both todo
            case "u-gro.com":
                return "/your-local-school/4832-u-gro-of-lititz-pa"; //both todo
            case "learningcaregroup.com":
                return ""; //todo
            default:
                return "Error: no brand";
        }
    }

    public static String getStep1SearchQuery() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "TX";
            case "pathwayslearningacademy.com":
                return "IN";
            default:
                return "";
        }
    }
}
