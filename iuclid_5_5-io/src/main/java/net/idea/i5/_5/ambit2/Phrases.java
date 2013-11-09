package net.idea.i5._5.ambit2;

import java.util.Hashtable;

/**
 * Hack to avoid generating classes for phrases.xsdwe only need few of them so far
 * @author nina
 *
 */
public class Phrases {
	public static final Hashtable<String, String> phrasegroup_N08 = initPhrasegroup_N08(); 
	public static final Hashtable<String, String> phrasegroup_N28 = initPhrasegroup_N28();
	public static final Hashtable<String, String> phrasegroup_N24 = phrasegroup_N24();
	public static final Hashtable<String, String> phrasegroup_A02 = phrasegroup_A02();
	public static final Hashtable<String, String> phrasegroup_A02_1 = phrasegroup_A02_1();
	public static final Hashtable<String, String> phrasegroup_A02_2 = phrasegroup_A02_2();
	/*
	 * Endpoint study records
	 */
	public static final Hashtable<String, String> phrasegroup_N64 = phrasegroup_N64();
	public static final Hashtable<String, String> phrasegroup_N78 = phrasegroup_N78();

	public static final Hashtable<String, String> phrasegroup_A36 = phrasegroup_A36();
	public static final Hashtable<String, String> phrasegroup_A101 = phrasegroup_A101();
	public static final Hashtable<String, String> phrasegroup_A03 = phrasegroup_A03();
	
	public static final Hashtable<String, String> phrasegroup_Y14_3 = phrasegroup_Y14_3(); //name="phrasegroup_Y14-3"
	public static final Hashtable<String, String> phrasegroup_Z02 = phrasegroup_Z02();
	public static final Hashtable<String, String> phrasegroup_Z03 = phrasegroup_Z03();
	public static final Hashtable<String, String> phrasegroup_Z05 = phrasegroup_Z05();
	public static final Hashtable<String, String> phrasegroup_Z06 = phrasegroup_Z06();
	public static final Hashtable<String, String> phrasegroup_Z08 = phrasegroup_Z08();
	public static final Hashtable<String, String> phrasegroup_Z30 = phrasegroup_Z30();
	public static final Hashtable<String, String> phrasegroup_Z31 = phrasegroup_Z31();	
	public static final Hashtable<String, String> phrasegroup_Z36 = phrasegroup_Z36();
	public static final Hashtable<String, String> phrasegroup_Z38 = phrasegroup_Z38();
	public static final Hashtable<String, String> phrasegroup_Z39 = phrasegroup_Z39();
	public static final Hashtable<String, String> phrasegroup_Z40 = phrasegroup_Z40();
				

	//Ecotox

	public static final Hashtable<String, String> phrasegroup_E01 = phrasegroup_E01();
	public static final Hashtable<String, String> phrasegroup_E02 = phrasegroup_E02();
	public static final Hashtable<String, String> phrasegroup_E03_1 = phrasegroup_E03_1();
	public static final Hashtable<String, String> phrasegroup_E04 = phrasegroup_E04();
	public static final Hashtable<String, String> phrasegroup_E05 = phrasegroup_E05();
	public static final Hashtable<String, String> phrasegroup_E35 = phrasegroup_E35();
	public static final Hashtable<String, String> phrasegroup_E102 = phrasegroup_E102();
	public static final Hashtable<String, String> phrasegroup_E103 = phrasegroup_E103();
	public static final Hashtable<String, String> phrasegroup_E104 = phrasegroup_E104();
	public static final Hashtable<String, String> phrasegroup_E105 = phrasegroup_E105();
	
	
	public static final Hashtable<String, String> phrasegroup_F102 = phrasegroup_F102();
	//TO_ACUTE_ORAL
	public static final Hashtable<String, String> phrasegroup_T124 = phrasegroup_T124();
	public static final Hashtable<String, String> phrasegroup_T02_1 = phrasegroup_T02_1(); //phrasegroup_T02-1
	public static final Hashtable<String, String> phrasegroup_T25_1 = phrasegroup_T25_1(); //phrasegroup_T25-1
	public static final Hashtable<String, String> phrasegroup_T24 = phrasegroup_T24();
	public static final Hashtable<String, String> phrasegroup_T23_1234 = phrasegroup_T23_1234(); //phrasegroup_T23-1234
	public static final Hashtable<String, String> phrasegroup_T123 = phrasegroup_T123();
	public static final Hashtable<String, String> phrasegroup_T48 = phrasegroup_T48();
	public static final Hashtable<String, String> phrasegroup_T03 = phrasegroup_T03();
	public static final Hashtable<String, String> phrasegroup_T148 = phrasegroup_T148();
	public static final Hashtable<String, String> phrasegroup_T01 = phrasegroup_T01();
	public static final Hashtable<String, String> phrasegroup_T04 = phrasegroup_T04();
	public static final Hashtable<String, String> phrasegroup_T108 = phrasegroup_T108();

    private static Hashtable<String, String> phrasegroup_T108() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("207", "Canada pesticides - ");
    	p.put("208", "Canada workplace - ");
    	p.put("645", "EU - ");
    	p.put("4453", "Japan - ");
    	p.put("1183", "OECD GHS - ");
    	p.put("1645", "US EPA pesticides - ");
    	p.put("1644", "US CPSC / US OSHA - ");
    	p.put("1643", "US CPSC / US FDA - ");
    	p.put("4104", "expert judgment - ");
    	p.put("1342", "other: - ");
    	p.put("2207", "not specified - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }

    private static Hashtable<String, String> phrasegroup_E105() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1758", "test mat. - ");
    	p.put("1754", "act. ingr. - ");
    	p.put("1756", "element - ");
    	p.put("1755", "dissolved - ");
    	p.put("1757", "labile/free - ");
    	p.put("1755", "dissolved - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_T04() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2081", "mg/kg bw - ");
    	p.put("2119", "mL/kg bw - ");
    	p.put("2103", "mg/m� - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }		

    
    private static Hashtable<String, String> phrasegroup_T01() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("928", "LD0 - ");
    	p.put("931", "LD50 - ");
    	p.put("930", "LD100 - ");
    	p.put("932", "LDLo - ");
    	p.put("1733", "approx. LD50 - ");
    	p.put("1858", "discriminating dose - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }		
    
    private static Hashtable<String, String> phrasegroup_T148() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }		
    private static Hashtable<String, String> phrasegroup_T03() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1249", "OECD Guideline 401 (Acute Oral Toxicity) - ");
    	p.put("1268", "OECD Guideline 420 (Acute Oral Toxicity - Fixed Dose Method) - ");
    	p.put("1271", "OECD Guideline 423 (Acute Oral toxicity - Acute Toxic Class Method) - ");
    	p.put("1273", "OECD Guideline 425 (Acute Oral Toxicity: Up-and-Down Procedure) - ");
    	p.put("663", "EU Method B.1 (Acute Toxicity (Oral)) - ");
    	p.put("664", "EU Method B.1 bis (Acute Oral Toxicity - Fixed Dose Procedure) - ");
    	p.put("665", "EU Method B.1 tris (Acute Oral Toxicity - Acute Toxic Class Method) - ");
    	p.put("405", "EPA OPP 81-1 (Acute Oral Toxicity) - ");
    	p.put("501", "EPA OPPTS 870.1100 (Acute Oral Toxicity) - ");
    	p.put("600", "EPA OTS 798.1175 (Acute Oral Toxicity) - ");
    	p.put("2246", "other guideline: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	  	
	
	private static Hashtable<String, String> phrasegroup_T48() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	      p.put("2437","unchanged (no vehicle) - ");
    	      p.put("1682","acetone - ");
    	      p.put("1735","arachis oil - ");
    	      p.put("1760","beeswax - ");
    	      p.put("1782","carbowaxe - ");
    	      p.put("1788","castor oil - ");
    	      p.put("1792","cetosteryl alcohol - ");
    	      p.put("1793","cetyl alcohol - ");
    	      p.put("194","CMC (carboxymethyl cellulose) - ");
    	      p.put("1804","coconut oil - ");
    	      p.put("1817","corn oil - ");
    	      p.put("1821","cotton seed oil - ");
    	      p.put("316","DMSO - ");
    	      p.put("1887","ethanol - ");
    	      p.put("1944","glycerol ester - ");
    	      p.put("1945","glycolester - ");
    	      p.put("1980","hydrogenated vegetable oil - ");
    	      p.put("2036","lecithin - ");
    	      p.put("2049","macrogel ester - ");
    	      p.put("2050", "maize oil - ");
    	      p.put("2221","olive oil - ");
    	      p.put("2253","paraffin oil - ");
    	      p.put("2259", "peanut oil - ");
    	      p.put("2261","petrolatum - ");
    	      p.put("2267", "physiol. saline - ");
    	      p.put("2274", "poloxamer - ");
    	      p.put("2275","polyethylene glycol - ");
    	      p.put("2296","propylene glycol - ");
    	      p.put("2360","silicone oil - ");
    	      p.put("2384", "sorbitan derivative - ");
    	      p.put("2385","soya oil - ");
    	      p.put("2417",     "theobroma oil - ");
    	      p.put("2447","vegetable oil - ");
    	      p.put("1659","water - ");
    	      p.put("1342","other: - ");
   	      p.put("1173","no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_T123() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("51", "acute toxic class method - ");
    	p.put("770", "fixed dose procedure - ");
    	p.put("1578", "standard acute method - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_T23_1234() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
          p.put("3487","Abyssinian - guinea pig");
          p.put("3501","AKR - mouse");
          p.put("3552","Angora - rabbit");
          p.put("3503","Balb/c - mouse");
          p.put("3553","Belgian Hare - rabbit");
          p.put("3565","Brown Norway - rat");
          p.put("3502","B6C3F1 - mouse");
          p.put("3506","CAF1 - mouse");
          p.put("3554","Californian - rabbit");
          p.put("3508" ,"CBA - mouse");
          p.put("3507" ,"CB6F1 - mouse");
          p.put("3509","CD-1 - mouse");
          p.put("3510" ,"CF-1 - mouse");
          p.put("3555" ,"Chinchilla - rabbit");
          p.put("3566" ,"Crj: CD(SD) - rat");
          p.put("3504","C3H - mouse");
          p.put("3505","C57BL - mouse");
          p.put("3511" ,"DBA - mouse");
          p.put("3512","DBF1 - mouse");
          p.put("3488","Dunkin-Hartley - guinea pig");
          p.put("3556" ,"Dutch - rabbit");
          p.put("3567","Fischer 344 - rat");
          p.put("3568","Fischer 344/DuCrj - rat");
          p.put("3557" ,"Flemish Giant - rabbit");
          p.put("3513" ,"FVB - mouse");
          p.put("3489" ,"Hartley - guinea pig");
          p.put("3558","Himalayan - rabbit");
          p.put("3514","ICL-ICR - mouse");
          p.put("3515","ICR - mouse");
          p.put("3569" ,"Lewis - rat");
          p.put("3570","Long-Evans - rat");
          p.put("3559" ,"New Zealand Black - rabbit");
          p.put("3560" ,"New Zealand Red - rabbit");
          p.put("3561" ,"New Zealand White - rabbit");
          p.put("3516","NMRI - mouse");
          p.put("3517","Nude Balb/cAnN - mouse");
          p.put("3518","Nude CD-1 - mouse");
          p.put("3571" ,"Osborne-Mendel - rat");
          p.put("3490","Peruvian - guinea pig");
          p.put("3491","Pirbright-Hartley - guinea pig");
          p.put("3562","Polish - rabbit");
          p.put("3563","San Juan - rabbit");
          p.put("3519","Sencar - mouse");
          p.put("3572","Sherman - rat");
          p.put("3492","Shorthair - guinea pig");
          p.put("3520" ,"SIV 50 - mouse");
          p.put("3521","SKH/HR1 - mouse");
          p.put("3573","Sprague-Dawley - rat");
          p.put("3522","Strain A - mouse");
          p.put("3523","Swiss - mouse");
          p.put("3524","Swiss Webster - mouse");
          p.put("9007","Tif:MAGf - mouse");
          p.put("3564","Vienna White - rabbit");
          p.put("3574","Wistar - rat");
          p.put("3575","Wistar Kyoto (WKY) - rat");
          p.put("3576","Zucker - rat");
          p.put("1342","other: - ");
          p.put("1173","no data - ");
            
     	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_T24() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1904", "female - ");
    	p.put("2051", "male - ");
    	p.put("2052", "male/female - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_T25_1() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2229", "oral: drinking water - ");
    	p.put("2231", "oral: gavage - ");
    	p.put("2228", "oral: capsule - ");
    	p.put("2230", "oral: feed - ");
    	p.put("2234", "oral: unspecified - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_T02_1() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("3485", "rat - common species");
    	p.put("3530", "cat - other species");
    	p.put("3531", "cattle - other species");
    	p.put("3532", "dog - other species");
    	p.put("3533", "gerbil - other species");
    	p.put("3534", "guinea pig - other species");
    	p.put("3536", "hamster, Armenian - other species");
    	p.put("3537", "hamster, Chinese - other species");
    	p.put("3538", "hamster, Syrian - other species");
    	p.put("3539", "hen - other species");
    	p.put("3541", "miniature swine - other species");
    	p.put("3542", "monkey - other species");
    	p.put("3543", "mouse - other species");
    	p.put("3545", "pig - other species");
    	p.put("3546", "primate - other species");
    	p.put("3547", "rabbit - other species");
    	p.put("3548", "sheep - other species");
    	p.put("3544", "other: - other species");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	
	private static Hashtable<String, String> phrasegroup_T124() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2286", "practically nontoxic - ");
    	p.put("2312", "relatively harmless - ");
    	p.put("2373", "sligthly toxic - ");
    	p.put("2126", "moderately toxic - ");
    	p.put("1960", "harmful - ");
    	p.put("2425", "toxic - ");
    	p.put("1972", "highly toxic - ");
    	p.put("2450", "very toxic - ");
    	p.put("1901", "extremely toxic - ");
    	p.put("1617", "Toxicity Category I - ");
    	p.put("1618", "Toxicity Category II - ");
    	p.put("1619", "Toxicity Category III - ");
    	p.put("1620", "Toxicity Category IV - ");
    	p.put("1621", "Toxicity Category V - ");
    	p.put("2195", "not classified - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_F102() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_E103() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2135", "mortality - ");
    	p.put("2469", "weight - ");
    	p.put("144", "behaviour - ");
    	p.put("2162", "mobility - ");
    	p.put("2143", "morphology - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	private static Hashtable<String, String> phrasegroup_E35() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2178", "nominal - ");
    	p.put("2002", "meas. (initial) - ");
    	p.put("1941", "meas. (geom. mean) - ");
    	p.put("1736", "meas. (arithm. mean) - ");
    	p.put("2421", "meas. (TWA) - ");
    	p.put("4038", "meas. (not specified) - ");
    	p.put("1685", "acid equivalent - ");
    	p.put("1884", "estimated - ");
    	p.put("1685", "acid equivalent - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
	private static Hashtable<String, String> phrasegroup_E05() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2155", "ng/L - ");
    	p.put("2500", "�g/L - ");
    	p.put("2098", "mg/L - ");
    	p.put("1935", "g/L - ");
    	p.put("2504", "�mol/L - ");
    	p.put("2123", "mmol/L - ");
    	p.put("2127", "mol/L - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	 
	private static Hashtable<String, String> phrasegroup_E104() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("922", "LC0 - ");
    	p.put("923", "LC10 - ");
    	p.put("926", "LC50 - ");
    	p.put("924", "LC100 - ");
    	p.put("360", "EC0 - ");
    	p.put("361", "EC10 - ");
    	p.put("365", "EC50 - ");
    	p.put("362", "EC100 - ");
    	p.put("933", "LL0 - ");
    	p.put("934", "LL10 - ");
    	p.put("936", "LL50 - ");
    	p.put("935", "LL100 - ");
    	p.put("368", "EL0 - ");
    	p.put("369", "EL10 - ");
    	p.put("373", "EL50 - ");
    	p.put("370", "EL100 - ");
    	p.put("855", "IC10 - ");
    	p.put("857", "IC50 - ");
    	p.put("856", "IC100 - ");
    	p.put("1149", "NOELR - ");
    	p.put("976", "LOELR - ");
    	p.put("1129", "NOEC - ");
    	p.put("957", "LOEC - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	 
	
    private static Hashtable<String, String> phrasegroup_E04() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2113", "min - ");
    	p.put("1976", "h - ");
    	p.put("2468", "wk - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	  	
	
    private static Hashtable<String, String> phrasegroup_E102() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1920", "freshwater - ");
    	p.put("2326", "saltwater - ");
    	p.put("1777", "brackish water - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	  	
	
    private static Hashtable<String, String> phrasegroup_E01() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2392", "static - ");
    	p.put("2393", "semi-static - ");
    	p.put("1914", "flow-through - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	  
    
    private static Hashtable<String, String> phrasegroup_E02() {
    	Hashtable<String, String> p = new Hashtable<String,String>();

	      p.put("55"  ,"Alburnus albidus costa - ");
	      p.put("56","Alburnus alburnus - ");
	      p.put("57","Alburnus lucidus - ");
	      p.put("58","Alburnus sp. - ");
	      p.put("65","Alosa pseudobarengus - ");
	      p.put("87","Anchoa mitchilli - ");
	      p.put("90","Anguilla anguilla - ");
	      p.put("91","Anguilla japonica - ");
	      p.put("92","Anguilla rostrata - ");
	      p.put("93","Anguilla sp. - ");
	      p.put("140","Barbus barbus - ");
	      p.put("4455","Brachydanio rerio (new name: Danio rerio) - ");
	      p.put("161","Brevoortia patronus - ");
	      p.put("162","Brevoortia tyrannus - ");
	      p.put("213","Carassius auratus - ");
	      p.put("214","Carassius carassius - ");
	      p.put("215","Carassius sp. - ");
	      p.put("216","Carassius vulgaris - ");
	      p.put("231","Catostomus commersoni - ");
	      p.put("233","Centropomus undecimalis - ");
	      p.put("234","Centropristis striata - ");
	      p.put("259","Clupea harengus - ");
	      p.put("264","Colisa fasciatus - ");
	      p.put("274","Coregonus artedii - ");
	      p.put("275","Coregonus clupeaformis - ");
	      p.put("290","Ctenopharyngodon idella - ");
	      p.put("296","Cymatogaster aggregata - ");
	      p.put("297","Cynoscion nebulosus - ");
	      p.put("298","Cyprinodon sp. - ");
	      p.put("299","Cyprinodon variegatus - ");
	      p.put("300","Cyprinus auratus - ");
	      p.put("301","Cyprinus carassius - ");
	      p.put("302","Cyprinus carpio - ");
	      p.put("303","Cyprinus sp. - ");
	      p.put("324","Danio rerio - ");
	      p.put("3892","Danio rerio (reported as Brachydanio rerio) - ");
	      p.put("341","Dorosoma petenese - ");
	      p.put("750","Esox lucius - ");
	      p.put("751","Esox masquinongi - ");
	      p.put("752","Esox niger - ");
	      p.put("753","Esox sp. - ");
	      p.put("781","Fundulus confluentus - ");
	      p.put("782","Fundulus diaphanus - ");
	      p.put("783","Fundulus grandis - ");
	      p.put("784","Fundulus heteroclitus - ");
	      p.put("785","Fundulus jenkinsi - ");
	      p.put("786","Fundulus lucidae - ");
	      p.put("787","Fundulus majalis - ");
	      p.put("788","Fundulus similis - ");
	      p.put("789","Fundulus sp. - ");
	      p.put("794","Gadus morrhua - ");
	      p.put("795","Gambusia affinis - ");
	      p.put("803","Gasterosteus aculeatus - ");
	      p.put("806","Gaus mexlaughs - ");
	      p.put("830","Harengula pensacolae - ");
	      p.put("883","Ictalurus catus - ");
	      p.put("884","Ictalurus furcatus - ");
	      p.put("885","Ictalurus melas - ");
	      p.put("886","Ictalurus natalis - ");
	      p.put("887","Ictalurus nebulosus - ");
	      p.put("888","Ictalurus punctatus - ");
	      p.put("889","Ictalurus sp. - ");
	      p.put("891","Idus idus - ");
	      p.put("920","Jordanella floridae - ");
	      p.put("984","Lagodon rhomboides - ");
	      p.put("986","Lebistes reticulatus - ");
	      p.put("988","Leiostomus xanthurus - ");
	      p.put("999","Lepomis auritus - ");
	      p.put("1000","Lepomis cyanellus - ");
	      p.put("1001","Lepomis gibbosus - ");
	      p.put("1002","Lepomis humilis - ");
	      p.put("1003","Lepomis macrochirus - ");
	      p.put("1004","Lepomis microlophus - ");
	      p.put("1005","Lepomis pallidus - ");
	      p.put("1006","Lepomis sp. - ");
	      p.put("1008","Leuciscus cephalus cabeda rissa - ");
	      p.put("1009","Leuciscus idus - ");
	      p.put("1010","Leuciscus idus melanotus - ");
	      p.put("1011","Leuciscus rutilus - ");
	      p.put("1012","Leuciscus sp. - ");
	      p.put("1015","Limanda aspera - ");
	      p.put("1016","Limanda limanda - ");
	      p.put("1017","Limanda sp. - ");
	      p.put("1062","Menidia beryllina - ");
	      p.put("1063","Menidia menidia - ");
	      p.put("1064","Menidia peninsulae - ");
	      p.put("1065","Menidia sp. - ");
	      p.put("1071","Micropogon undulatus - ");
	      p.put("1072","Micropterus dolomieui - ");
	      p.put("1073","Micropterus salmoides - ");
	      p.put("1074","Micropterus sp. - ");
	      p.put("1079","Misgurnus anguillicaudatus - ");
	      p.put("1087","Morone chrysops - ");
	      p.put("1088","Morone saxatilis - ");
	      p.put("1089","Morone sp. - ");
	      p.put("1093","Mugil cephalus - ");
	      p.put("1094","Mugil curema - ");
	      p.put("1095","Mugil sp. - ");
	      p.put("1178","Notropis atherinoides - ");
	      p.put("1316","Oncorhynchus gorbuscha - ");
	      p.put("1317","Oncorhynchus keta - ");
	      p.put("1318","Oncorhynchus kisutch - ");
	      p.put("1319","Oncorhynchus mykiss - ");
	      p.put("3893","Oncorhynchus mykiss (reported as Salmo gairdneri) - ");
	      p.put("1321","Oncorhynchus nerka - ");
	      p.put("1322","Oncorhynchus nerka kennerlyi - ");
	      p.put("1323","Oncorhynchus sp. - ");
	      p.put("1324","Oncorhynchus tschawytscha - ");
	      p.put("1337","Oryzias latipes - ");
	      p.put("1340","Osmerus mordax - ");
	      p.put("1357","Parophrys vetulus - ");
	      p.put("1359","Perca flavescens - ");
	      p.put("1360","Perca fluviatilis - ");
	      p.put("1361","Perca sp. - ");
	      p.put("1364","Petromyzon fluviatilis - ");
	      p.put("1365","Petromyzon marinus - ");
	      p.put("1366","Petromyzon sp. - ");
	      p.put("1373","Phoxinus laevis - ");
	      p.put("1374","Phoxinus phoxinus - ");
	      p.put("1375","Phoxinus sp. - ");
	      p.put("1377","Pimephales notatus - ");
	      p.put("1378","Pimephales promelas - ");
	      p.put("1379","Pimephales sp. - ");
	      p.put("1383","Platypoecilus maculatus - ");
	      p.put("1386","Pleuronectes platessa - ");
	      p.put("1388","Poecilia latipinna - ");
	      p.put("1389","Poecilia reticulata - ");
	      p.put("1390","Poecilia sp. - ");
	      p.put("1393","Pogonias cromis - ");
	      p.put("1396","Pomatomus saltatrix - ");
	      p.put("1397","Pomoxis annularis - ");
	      p.put("1398","Pomoxis nigromaculatus - ");
	      p.put("1430","Prosopium williamsoni - ");
	      p.put("1439","Pseudopleuronectes americanus - ");
	      p.put("1442","Ptychocheilus oregonensis - ");
	      p.put("1477","Rasbora heteromorpha - ");
	      p.put("1490","Rhodeus sericeus - ");
	      p.put("1494","Roccus americanus - ");
	      p.put("1498","Rutilus rutilus - ");
	      p.put("1510","Salmo aquabonita - ");
	      p.put("1511","Salmo clarki - ");
	      p.put("1320","Salmo gairdneri (new name: Oncorhynchus mykiss) - ");
	      p.put("1512","Salmo irideus - ");
	      p.put("1513","Salmo salar - ");
	      p.put("1514","Salmo sp. - ");
	      p.put("1515","Salmo trutta - ");
	      p.put("1516","Salvelinus alpinus - ");
	      p.put("1517","Salvelinus fontinalis - ");
	      p.put("1518","Salvelinus malma - ");
	      p.put("1519","Salvelinus namaycush - ");
	      p.put("1520","Salvelinus sp. - ");
	      p.put("1526","Sardinops sagax - ");
	      p.put("1527","Sarotherodon mossambicus - ");
	      p.put("1531","Scardinius erythrophthalmus - ");
	      p.put("1537","Sciaenops ocellata - ");
	      p.put("1545","Semolitus atromaculatus - ");
	      p.put("1569","Sphaeroidus maculatus - ");
	      p.put("1581","Stizostedion canadense - ");
	      p.put("1582","Stizostedion v. vitreum - ");
	      p.put("1611","Tinca sp. - ");
	      p.put("1612","Tinca tinca - ");
	      p.put("1613","Tinca vulgaris - ");
	      p.put("1639","Trutta iridea - ");
	      p.put("1342","other: - ");
	      p.put("1173","no data - ");
	      p.put("NOT_SPECIFIED","");

    	return p;
    }
	private static Hashtable<String, String> phrasegroup_A03() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_Z36() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("2203", "not required - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_A101() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2682", "aerosol - ");
    	p.put("1808", "compact - ");
    	p.put("1825", "crystalline - ");
    	p.put("2787", "dispersion - ");
    	p.put("2816", "fibre - ");
    	p.put("2818", "filaments - ");
    	p.put("1910", "flakes - ");
    	p.put("2892", "liquified gas - ");
    	p.put("8051", "nanomaterial - ");
    	p.put("2991", "particulates - ");
    	p.put("3886", "paste - ");
    	p.put("2260", "pellets - ");
    	p.put("3167", "refrigerated liquid - ");
    	p.put("3356", "suspension - ");
    	p.put("2452", "viscous - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	private static Hashtable<String, String> phrasegroup_Z39() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("4174", "CAS name - ");
    	p.put("4175", "CAS number - ");
    	p.put("4176", "common name - ");
    	p.put("4177", "EC name - ");
    	p.put("4178", "EC number - ");
    	p.put("3452", "IUPAC name - ");
    	p.put("3451", "TSCA name - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_Z38() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_Z40() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("4179", "yes (incl. certificate) - ");
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
	private static Hashtable<String, String> phrasegroup_Z08() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("2193", "not applicable - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
	private static Hashtable<String, String> phrasegroup_E03_1() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1201", "OECD Guideline 203 (Fish, Acute Toxicity Test) - ");
    	p.put("1202", "OECD Guideline 204 (Fish, Prolonged Toxicity Test: 14-day Study) - ");
    	p.put("706", "EU Method C.1 (Acute Toxicity for Fish) - ");
    	p.put("399", "EPA OPP 72-1 (Fish Acute Toxicity Test) - ");
    	p.put("461", "EPA OPPTS 850.1075 (Freshwater and Saltwater Fish Acute Toxicity Test) - ");
    	p.put("462", "EPA OPPTS 850.1085 (Fish Acute Toxicity Test mitigated by humic acid) - ");
    	p.put("579", "EPA OTS 797.1400 (Fish Acute Toxicity Test) - ");
    	p.put("580", "EPA OTS 797.1460 (Fish Acute Toxicity Test mitigated by humic acid) - ");
    	p.put("870", "ISO 7346-1 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)] - Part 1: Static Method) - ");
    	p.put("871", "ISO 7346-1 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)] - Part 2: Semi-static method) - ");
    	p.put("872", "ISO 7346-1 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)] - Part 3: Flow-through method) - ");
    	p.put("873", "ISO 7346/1-3 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)]) - ");
    	p.put("2246", "other guideline: -"); 
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
	private static Hashtable<String, String> phrasegroup_Z06() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1680", "according to - ");
    	p.put("1880", "equivalent or similar to - ");
    	p.put("2172", "no guideline followed - ");
    	p.put("2172", "no guideline followed - ");
    	p.put("2175", "no guideline required - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
    private static Hashtable<String, String> phrasegroup_Z30() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("4161", "yes, but willing to share - ");
    	p.put("4162", "yes, but not willing to share - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    	
	
    private static Hashtable<String, String> phrasegroup_Z03() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1838", "data submitter is data owner - ");
    	p.put("1837", "data submitter has Letter of Access - ");
    	p.put("1835", "data no longer protected - ");
    	p.put("1836", "data published - ");
    	p.put("2193", "not applicable - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
    private static Hashtable<String, String> phrasegroup_Z31() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1586", "study report - ");
    	p.put("266", "other company data - ");
    	p.put("1433", "publication - ");
    	p.put("1486", "review article or handbook - ");
    	p.put("1542", "secondary source - ");
    	p.put("811", "grey literature - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
    private static Hashtable<String, String> phrasegroup_A36() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1", "1 (reliable without restriction) - ");
    	p.put("18", "2 (reliable with restrictions) - ");
    	p.put("22", "3 (not reliable) - ");
    	p.put("24", "4 (not assignable) - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }		
	
    private static Hashtable<String, String> phrasegroup_Z05() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1895", "experimental result - ");
    	p.put("1896", "experimental study planned - ");
    	p.put("1885", "estimated by calculation - ");
    	p.put("2303", "read-across based on grouping of substances (category approach) - ");
    	p.put("2304", "read-across from supporting substance (structural analogue or surrogate) - ");
    	p.put("14", "(Q)SAR - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
    private static Hashtable<String, String> phrasegroup_Z02() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1588", "study technically not feasible - ");
    	p.put("1587", "study scientifically unjustified - ");
    	p.put("982", "exposure considerations - ");
    	p.put("2533", "other justification - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
    private static Hashtable<String, String> phrasegroup_Y14_3() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("921", "key study - ");
    	p.put("1590", "supporting study - ");
    	p.put("1661", "weight of evidence - ");
    	p.put("8108", "disregarded study - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_N78() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("733", "EU: BPD - Biocidal Products Directive 98/8/EC or EU: BPR - Biocidal Products Regulation 528/2012/EC");
    	p.put("9000", "EU: CLP - Classification, Labelling and Packaging");
    	p.put("735", "EU: REACH - Registration, Evaluation and Authorisation of Chemicals");
    	p.put("209", "CA: CEPA - Existing Substances Program under CEPA");
    	p.put("210", "CA: PCPA - Pest Control Products Act");
    	p.put("919", "JP: CSCL - Chemical Substances Control Law");
    	p.put("1313", "OECD - Cooperative Chemicals Assessment Programme");
    	p.put("1646", "US: EPA HPVC - HPV Chemical Challenge Programme");
    	p.put("1647", "US: FIFRA - Federal Insecticide, Fungicide, and Rodenticide Act");
    	p.put("1648", "US: TSCA - Toxic Substances Control Act");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
    private static Hashtable<String, String> phrasegroup_N64() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2732", "CBI - confidential business information");
    	p.put("2859", "IP - intellectual property");
    	p.put("3441", "no PA - not public available");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
    private static Hashtable<String, String> initPhrasegroup_N08() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2915", "mono constituent substance");
    	p.put("2923", "multi constituent substance");
    	p.put("3401", "UVCB");
    	p.put("3001", "polymer");
    	p.put("1342", "other:");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_N24() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2505", "% (w/w)");
    	p.put("2506", "% (v/v)");
    	p.put("2098", "mg/L");
    	p.put("3437", "mg/kg");
    	p.put("2283", "ppm");
    	p.put("3440", ",mg/m\u00B3");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> initPhrasegroup_N28() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2675", "absorbent");
    	p.put("2680", "adsorbent");
    	p.put("2693", "anticaking agent");
    	p.put("2694", "anticoagulant");
    	p.put("2721", "booster");
    	p.put("2728", "buffer");
    	p.put("2752", "coagulant");
    	p.put("2753", "coating agent");
    	p.put("2756", "colourant");
    	p.put("2761", "complexing agent");
    	p.put("2763", "conditioner");
    	p.put("2768", "controlled release agent");
    	p.put("2772", "crystal growth regulator");
    	p.put("2781", "dehydrating agent");
    	p.put("2783", "denaturant");
    	p.put("2794", "drying agent");
    	p.put("2795", "dye");
    	p.put("2802", "emulsifier");
    	p.put("2819", "filler");
    	p.put("2823", "flow aid agent");
    	p.put("2824", "fragrance");
    	p.put("2847", "hardener");
    	p.put("2895", "lubricant");
    	p.put("2918", "moisturiser");
    	p.put("2937", "neutraliser");
    	p.put("2976", "odour masking agent");
    	p.put("3442", "pH adjuster");
    	p.put("2999", "pigment");
    	p.put("3026", "propellant");
    	p.put("3342", "solvent");
    	p.put("3348", "stabiliser");
    	p.put("3350", "stiffener");
    	p.put("3400", "UV absorber");
    	p.put("3424", "viscosity modifier");
    	p.put("3426", "water repellent");
    	p.put("3429", "wetting agent");
    	p.put("1342", "other:");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	    


    private static Hashtable<String, String> phrasegroup_A02() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("29", "&lt;");
    	p.put("30", "&lt;=");
    	p.put("32", "&gt;");
    	p.put("33", "&gt;=");
    	p.put("1779", "ca.");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }

    
    private static Hashtable<String, String> phrasegroup_A02_1() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("32", "&gt;");
    	p.put("33", "&gt;=");
    	p.put("1779", "ca.");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_A02_2() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("29", "&lt;");
    	p.put("30", "&lt;=");
    	p.put("1779", "ca.");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }

	private Phrases() {
	}
}
