package helpers;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrandDataSwitch {

    public static String getBrandForDropDown() {
        switch (TestConfig.domain)
        {
            case "tutortime.com":
                return  "Tutor Time Child Care";
            case "pathwayslearningacademy.com":
                return "Pathways Learning Academy";
            case "montessori.com":
                return "Montessori Unlimited";
            case "lapetite.com":
                return "La Petite Academy";
            case "everbrookacademy.com":
                return "Everbrook Academy";
            case "creativekidslearningcenter.com":
                return "Creative Kids Learning Center";
            case "childtime.com":
                return "Childtime Learning Centers";
            case "childrenscourtyard.com":
                return "The Children's Courtyard";
            case "u-gro.com":
                return "U-GRO";
            case "learningcaregroup.com":
                return ""; //todo
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }


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
                return "/your-local-school/silverdale-wa-0902"; //both
            case "childrenscourtyard.com":
                return "/your-local-school/dupont-wa-3220/"; //both
            case "u-gro.com":
                return "/your-local-school/4832-u-gro-of-lititz-pa"; //both
            case "learningcaregroup.com":
                return ""; //todo
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }

    public static String getEmailAddress() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "TT_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "pathwayslearningacademy.com":
                return "PLA_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "montessori.com":
                return "MU_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "lapetite.com":
                return "LPA_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "everbrookacademy.com":
                return "EA_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "creativekidslearningcenter.com":
                return "CK_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "childtime.com":
                return "CT_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "childrenscourtyard.com":
                return "CCY_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            case "u-gro.com":
                return "UG_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "@example.com";
            default:
                return "";
        }
    }

    public static String getStep4ExpectedText() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "Tutor Time of Murrieta, CA";
            case "pathwayslearningacademy.com":
                return "Pathways Learning Academy of Indianapolis, IN";
            case "montessori.com":
                return "Montessori Unlimited of Duluth, GA";
            case "lapetite.com":
                return "La Petite Academy of Albuquerque, NM";
            case "everbrookacademy.com":
                return "Everbrook Academy of Novi, MI";
            case "creativekidslearningcenter.com":
                return "Creative Kids of Las Vegas, NV";
            case "childtime.com":
                return "Childtime of San Diego, CA";
            case "childrenscourtyard.com":
                return "The Children's Courtyard of Aurora, IL";
            default:
                return "Error: no brand";
        }
    }

    public static String getStep5ExpectedText() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "To confirm and schedule your Tutor Time of Murrieta, CA";
            case "pathwayslearningacademy.com":
                return "To confirm and schedule your Pathways Learning Academy of Indianapolis, IN";
            case "montessori.com":
                return "To confirm and schedule your Montessori Unlimited of Duluth, GA";
            case "lapetite.com":
                return "To confirm and schedule your La Petite Academy of Albuquerque, NM";
            case "everbrookacademy.com":
                return "To confirm and schedule your Everbrook Academy of Novi, MI";
            case "creativekidslearningcenter.com":
                return "To confirm and schedule your Creative Kids of Las Vegas, NV";
            case "childtime.com":
                return "To confirm and schedule your Childtime of San Diego, CA";
            case "childrenscourtyard.com":
                return "To confirm and schedule your The Children's Courtyard of Aurora, IL";
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
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
                return "/montessori-schools/find-a-school/search-results/?state=GA";
            case "lapetite.com":
                return "/child-care-centers/find-a-school/search-results/?location=87122";
            case "everbrookacademy.com":
                return "/locations/find-a-school/search-results/?state=MI";
            case "creativekidslearningcenter.com":
                return "/locations";
            case "childtime.com":
                return "child-care-centers/find-a-school/search-results/?location=92126";
            case "childrenscourtyard.com":
                return "child-care-centers/find-a-school/search-results/?location=aurora%2C+il";
            case "u-gro.com":
                return "/your-local-school/4832-u-gro-of-lititz-pa"; //both todo
            case "learningcaregroup.com":
                return ""; //todo
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }

    public static String getStep1SearchQuery() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "murietta";
            case "pathwayslearningacademy.com":
                return "IN";
            case "montessori.com":
                return "GA";
            case "lapetite.com":
                return "87122";
            case "everbrookacademy.com":
                return "MI";
            case "creativekidslearningcenter.com":
                return "NV";
            case "childtime.com":
                return "92126";
            case "childrenscourtyard.com":
                return "Aurora, IL";
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }

    public static String getDMAPageURL() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "/area/oxnard-thousand-oaks-ventura/";
            case "pathwayslearningacademy.com":
                return "n/a";
            case "montessori.com":
                return "/area/atlanta-sandy-springs-marietta/";
            case "lapetite.com":
                return "/area/atlanta-sandy-springs-marietta/";
            case "everbrookacademy.com":
                return "/area/charlotte-gastonia-concord/";
            case "creativekidslearningcenter.com":
                return "n/a";
            case "childtime.com":
                return "/area/akron/";
            case "childrenscourtyard.com":
                return "/area/austin-round-rock/";
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }

    public static String getCampaignPageURL() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "/campaign/aiss/";
            case "pathwayslearningacademy.com":
                return "n/a";
            case "montessori.com":
                return "/campaign/aiss/";
            case "lapetite.com":
                return "/campaign/aiss/";
            case "everbrookacademy.com":
                return "/campaign/aiss/";
            case "creativekidslearningcenter.com":
                return "n/a";
            case "childtime.com":
                return "/campaign/aiss/";
            case "childrenscourtyard.com":
                return "/campaign/aiss/";
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }

    public static String getLCGandB2Bsearch() {
        switch (TestConfig.domain) {
            case "tutortime.com":
                return "garden plain";
            case "pathwayslearningacademy.com":
                return "46220";
            case "montessori.com":
                return "30022";
            case "lapetite.com":
                return "covington";
            case "everbrookacademy.com":
                return "fort collins";
            case "creativekidslearningcenter.com":
                return "henderson";
            case "childtime.com":
                return "renton";
            case "childrenscourtyard.com":
                return "80530";
            default:
                throw new IllegalStateException("Unexpected value: " + TestConfig.domain);
        }
    }
}
