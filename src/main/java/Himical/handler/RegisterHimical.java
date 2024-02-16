package Himical.handler;

import Himical.Items.ChemicalDust;
import Himical.Items.ChemicalElements;
import Himical.Items.Ores_dust;
import Himical.ores.ChemicalOres;
import Himical.ores.Magnetite_ores;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHimical {
    //region ’имические элементы
    //1 период
    public static final ChemicalElements HYDROGEN = new ChemicalElements("Hydrogen", "H", 14.01);
    public static final ChemicalElements HYDROGEN_2 = new ChemicalElements("Hydrogen-2 (deuterium)", "H-2 (D)");
    public static final ChemicalElements Hydrogen_3 = new ChemicalElements("Hydrogen-3 (tritium)", "H-3 (T)");
    public static final ChemicalElements HELIUM = new ChemicalElements("Helium", "He");
    public static final ChemicalElements HELIUM_3 = new ChemicalElements("Helium-3", "He-3");
    public static final ChemicalElements LITHIUM = new ChemicalElements("Lithium", "Li", 453.69);
    public static final ChemicalElements BERYLLIUM = new ChemicalElements("Beryllium", "Be", 1560);
    public static final ChemicalElements BORON = new ChemicalElements("Boron", "B", 2348);
    public static final ChemicalElements CARBON = new ChemicalElements("Carbon", "C", 3915);
    public static final ChemicalElements NITROGEN = new ChemicalElements("Nitrogen", "N", 63.05);
    public static final ChemicalElements OXYGEN = new ChemicalElements("Oxygen", "O");
    public static final ChemicalElements FLUORINE = new ChemicalElements("Fluorine", "F");
    public static final ChemicalElements NEON = new ChemicalElements("Neon", "Ne");

    public static final ChemicalElements SODIUM = new ChemicalElements("Sodium", "Na");
    public static final ChemicalElements MAGNESIUM = new ChemicalElements("Magnesium", "Ng");
    public static final ChemicalElements ALUMINIUM = new ChemicalElements("Aluminium", "Al");
    public static final ChemicalElements SILICON = new ChemicalElements("Silicon", "Si");
    public static final ChemicalElements PHOSPHORUS = new ChemicalElements("Phosphorus", "P");
    public static final ChemicalElements SULFUR = new ChemicalElements("Sulfur", "S");
    public static final ChemicalElements CHLORINE = new ChemicalElements("Chlorine", "Cl");
    public static final ChemicalElements ARGON = new ChemicalElements("Argon", "Ar");
    public static final ChemicalElements POTASSIUM = new ChemicalElements("Potassium", "K");
    public static final ChemicalElements CALCIUM = new ChemicalElements("Calcium", "Ca");
    public static final ChemicalElements SCANDIUM = new ChemicalElements("Scandium", "Sc");
    public static final ChemicalElements TITANIUM = new ChemicalElements("Titanium", "Ti");
    public static final ChemicalElements VANADIUM = new ChemicalElements("Vanadium", "V");
    public static final ChemicalElements CHROMIUM = new ChemicalElements("Chromium", "Cr");
    public static final ChemicalElements MANGANESE = new ChemicalElements("Manganese", "Mn");
    public static final ChemicalElements IRON = new ChemicalElements("Iron", "Fe", 1811);
    public static final ChemicalElements COBALT = new ChemicalElements("Cobalt", "Co", 1768);
    public static final ChemicalElements NICKEL = new ChemicalElements("Nickel", "Ni", 1728);
    public static final ChemicalElements COPPER = new ChemicalElements("Copper", "Cu", 1357.77);
    public static final ChemicalElements ZINC = new ChemicalElements("Zinc", "Zn", 692.68);
    public static final ChemicalElements GALLIUM = new ChemicalElements("Gallium", "Ga", 302.91);
    public static final ChemicalElements GERMANIUM = new ChemicalElements("Germanium", "Ge", 1211.4);
    public static final ChemicalElements ARSENIC = new ChemicalElements("Arsenic", "As", 1090);
    public static final ChemicalElements SELENIUM = new ChemicalElements("Selenium", "Se", 494);
    public static final ChemicalElements BROMINE = new ChemicalElements("Bromine", "Br");
    public static final ChemicalElements KRYPTON = new ChemicalElements("Krypton", "Kr");

    public static final ChemicalElements RUBIDIUM = new ChemicalElements("Rubidium", "Rb");
    public static final ChemicalElements STRONTIUM = new ChemicalElements("Strontium", "Sr", 1000);
    public static final ChemicalElements YTTRIUM = new ChemicalElements("Yttrium", "Y");
    public static final ChemicalElements ZIRCONIUM = new ChemicalElements("Zirconium", "Zr", 2128);
    public static final ChemicalElements NIOBIUM = new ChemicalElements("Niobium", "Nb", 2750);
    public static final ChemicalElements MOLYBDENUM = new ChemicalElements("Molybdenum", "Mo", 2896);
    public static final ChemicalElements TECHNETIUM = new ChemicalElements("Technetium", "Tc", 2430);
    public static final ChemicalElements RUTHENIUM = new ChemicalElements("Ruthenium", "Ru", 2607);
    public static final ChemicalElements RHODIUM = new ChemicalElements("Rhodium", "Rh");
    public static final ChemicalElements PALLADIUM = new ChemicalElements("Palladium", "Pd", 1828.05);
    public static final ChemicalElements SILVER = new ChemicalElements("Silver", "Ag", 1234.93);
    public static final ChemicalElements CADMIUM = new ChemicalElements("Cadmium", "Cd");
    public static final ChemicalElements INDIUM = new ChemicalElements("Indium", "In");
    public static final ChemicalElements TIN = new ChemicalElements("Tin", "Sn", 505.08);
    public static final ChemicalElements ANTIMONY = new ChemicalElements("Antimony", "Sb");
    public static final ChemicalElements TELLURIUM = new ChemicalElements("Tellurium", "Te");
    public static final ChemicalElements IODINE = new ChemicalElements("Iodine", "I");
    public static final ChemicalElements XENON = new ChemicalElements("Xenon", "Xe");

    public static final ChemicalElements CAESIUM = new ChemicalElements("Caesium", "Cs");
    public static final ChemicalElements BARIUM = new ChemicalElements("Barium", "Ba");
    public static final ChemicalElements LANTHANUM = new ChemicalElements("Lanthanum", "La");
    public static final ChemicalElements CERIUM = new ChemicalElements("Cerium", "Ce");
    public static final ChemicalElements PRASEODYMIUM = new ChemicalElements("Praseodymium", "Pr");
    public static final ChemicalElements NEODYMIUM = new ChemicalElements("Neodymium", "Nd", 1294);
    public static final ChemicalElements PROMETHIUM = new ChemicalElements("Promethium", "Pm");
    public static final ChemicalElements SAMARIUM = new ChemicalElements("Samarium", "Sm");
    public static final ChemicalElements EUROPIUM = new ChemicalElements("Europium", "Eu");
    public static final ChemicalElements GADOLINIUM = new ChemicalElements("Gadolinium", "Gd", 1586);
    public static final ChemicalElements TERBIUM = new ChemicalElements("Terbium", "Tb", 1629);
    public static final ChemicalElements DYSPROSIUM = new ChemicalElements("Dysprosium", "Dy");
    public static final ChemicalElements HOLMIUM = new ChemicalElements("Holmium", "Ho", 1747);
    public static final ChemicalElements ERBIUM = new ChemicalElements("Erbium", "Er", 1770);
    public static final ChemicalElements THULIUM = new ChemicalElements("Thulium", "Tm");
    public static final ChemicalElements YTTERBIUM = new ChemicalElements("Ytterbium", "Yb", 1092);
    public static final ChemicalElements LUTETIUM = new ChemicalElements("Lutetium", "Lu"); //<-----
    public static final ChemicalElements TANTALUM = new ChemicalElements("Tantalum", "Ta", 3290);
    public static final ChemicalElements TUNGSTEN = new ChemicalElements("Tungsten", "W");
    public static final ChemicalElements RHENIUM = new ChemicalElements("Rhenium", "Re");
    public static final ChemicalElements OSMIUM = new ChemicalElements("Osmium", "Os", 3306);
    public static final ChemicalElements IRIDIUM = new ChemicalElements("Iridium", "Ir", 2739);
    public static final ChemicalElements PLATINUM = new ChemicalElements("Platinum", "Pt", 2041.4);
    public static final ChemicalElements GOLD = new ChemicalElements("Gold", "Au", 1337.33);
    public static final ChemicalElements MERCURY = new ChemicalElements("Mercury", "Hg");
    public static final ChemicalElements THALLIUM = new ChemicalElements("Thallium", "Ti", 577);
    public static final ChemicalElements LEAD = new ChemicalElements("Lead", "Pb", 600.61);
    public static final ChemicalElements BISMUTH = new ChemicalElements("Bismuth", "Bi", 544.4);
    public static final ChemicalElements POLONIUM = new ChemicalElements("Polonium", "Po", 528);
    public static final ChemicalElements ASTATINE = new ChemicalElements("Astatine", "At", 575);
    public static final ChemicalElements RADON = new ChemicalElements("Radon", "Rn", 202);
    // 7 период
    public static final ChemicalElements FRANCIUM = new ChemicalElements("Francium", "Fr", 294);
    public static final ChemicalElements RADIUM = new ChemicalElements("Radium", "Ra", 973);
    public static final ChemicalElements ACTINIUM = new ChemicalElements("Actinium", "Ac");
    public static final ChemicalElements THORIUM = new ChemicalElements("Thorium", "Th", 2023);
    public static final ChemicalElements PROTACTINIUM = new ChemicalElements("Protactinium", "Pa");
    public static final ChemicalElements URANIUM = new ChemicalElements("Uranium", "U", 1408);
    public static final ChemicalElements NEPTUNIUM = new ChemicalElements("Neptunium", "Np");
    public static final ChemicalElements PLUTONIUM = new ChemicalElements("Plutonium", "Pu");
    public static final ChemicalElements AMERICIUM = new ChemicalElements("Americium", "Am");
    public static final ChemicalElements CURIUM = new ChemicalElements("Curium", "Cm");
    public static final ChemicalElements BERKELIUM = new ChemicalElements("Berkelium", "Bk");
    public static final ChemicalElements CALIFORNIUM = new ChemicalElements("Californium", "Cf");
    public static final ChemicalElements EINSTEINIUM = new ChemicalElements("Einsteinium", "Es");
    public static final ChemicalElements FERMIUM = new ChemicalElements("Fermium", "Fm");
    public static final ChemicalElements MENDELEVIUM = new ChemicalElements("Mendelevium", "Md");
    public static final ChemicalElements NOBELIUM = new ChemicalElements("Nobelium", "No");
    public static final ChemicalElements LAWRENCIUM = new ChemicalElements("Lawrencium", "Lr");
    //endregion

    //region –уда пыль
    public static final Ores_dust Beryl_dust = new Ores_dust("Beryl"+"_dust", "Al2[Be3(Si6O18)]"); // 14% ќксид берили€; 19% ќксид алюмини€; 67%  ремний
    public static final Ores_dust CHRYSOBERYL_DUST = new Ores_dust("Chrysoberyl"+"_dust", "BeAl2O4"); // BeO Ч 19,71%; Al2O3 Ч 80,29%
    public static final Ores_dust BERTRANDITE_DUST = new Ores_dust("Bertrandite"+"_dust", "Be4[Si2O7](OH)2"); // BeO Ч 42,02%, SiO2 Ч 50,42%, H2O Ч 7,56%
    public static final Ores_dust HEMATITE_DUST = new Ores_dust("Hematite"+"_dust", "Fe2O3");
    public static final Ores_dust LIMONITE_DUST = new Ores_dust("Limonite"+"_dust", "FeOOHЈ(Fe2O3ЈnH2O)"); //спавн р€дом с гематитом
    public static final Ores_dust CHALCOPYRITE_DUST = new Ores_dust("Chalcopyrite"+"_dust", "CuFeS2"); //35% меди 65% железа
    public static final Ores_dust CHALCOSINE_DUST = new Ores_dust("Chalcosine"+"_dust", "Cu2S"); //79.8% меди 20.2% серы
    public static final Ores_dust COVELLIN_DUST = new Ores_dust("Covellin"+"_dust", "CuS"); //66.5% меди 33.54% серы
    public static final Ores_dust BORNITE_DUST = new Ores_dust("Bornite"+"_dust", "Cu5FeS4"); //Cu Ч 63,3 %, Fe Ч 11,2 %, S Ч 25,5 %
    public static final Ores_dust TETRAHEDRITE_DUST = new Ores_dust("Tetrahedrite"+"_dust", "(Cu,Fe)12Sb4S13"); // ¬ пометках
    public static final Ores_dust MALACHITE_DUST = new Ores_dust("Malachite"+"_dust", "(CuOH)2CO3"); //71,9 % CuO оксид меди (Cu 57 %), 19,9 % CO2 углекислоты
    public static final Ores_dust AZURITE_DUST = new Ores_dust("Azurite"+"_dust", "Cu3(—ќ3)2(ќЌ)2"); //ќкись меди (—uќ) 69,2%, двуокись углерода (—ќ2) 25,6%
    public static final Ores_dust KUPRIT_DUST = new Ores_dust("Kuprit"+"_dust", "CuS"); //88.8% меди
    public static final Ores_dust CHRYSOCOLLA_DUST = new Ores_dust("Chrysocolla"+"_dust", "(Cu, Al)2H2Si2O5(OH)4*nH2O"); // 3,88% Ч Al2O3; 42,39% Ч CuO; 36,59% Ч SiO2; 17,14% Ч H2O.
    public static final Ores_dust FERBERITE_DUST = new Ores_dust("Ferberite"+"_dust", "FeWO4"); //FeWO4 - 80%
    public static final Ores_dust HUBNERITE_DUST = new Ores_dust("Hubnerite"+"_dust", "(FeMn)WO4"); //FeWO4 - 15% Mn - 23,4 %
    public static final Ores_dust NEPHELINE_DUST = new Ores_dust("Nepheline"+"_dust", "\u0028"+"Na,K"+"\u0029"+"AlSiO4"); // Na2O - 16%; јl2ќ3 - 32%; SiO2 - 45%:  2ќ - 6.5%
    //endregion

    //region ѕыль элементы
    public static final ChemicalDust LITHIUM_DUST = new ChemicalDust("Lithium_dust", "Li");
    public static final ChemicalDust BERYLLIUM_OXIDE = new ChemicalDust("Beryllium_oxide", "BeO", 1);
    public static final ChemicalDust Beryllium_dust = new ChemicalDust("Beryllium_dust", "Be");
    public static final ChemicalDust BORON_DUST = new ChemicalDust("Boron_dust", "B");
    public static final ChemicalDust CARBON_DUST = new ChemicalDust("Carbon_dust", "C");
    public static final ChemicalDust SODIUM_DUST = new ChemicalDust("Sodium"+ "_dust", "Na");
    public static final ChemicalDust SODIUM_OXIDE = new ChemicalDust("Sodium_oxide", "Na2O", 2);
    public static final ChemicalDust MAGNESIUM_DUST = new ChemicalDust("Magnesium"+ "_dust", "Mg");
    public static final ChemicalDust ALUMINUM_DUST = new ChemicalDust("Aluminum_dust", "Al");
    public static final ChemicalDust ALUMINUM_OXIDE = new ChemicalDust("Aluminum_oxide", "Al2O3");
    public static final ChemicalDust SILICON_DUST = new ChemicalDust("Silicon_dust", "Si");
    public static final ChemicalDust PHOSPHORUS_DUST = new ChemicalDust("Phosphorus_dust", "P");
    public static final ChemicalDust SULFUR_DUST = new ChemicalDust("Sulfur"+ "_dust", "S");
    public static final ChemicalDust POTASSIUM_DUST = new ChemicalDust("Potassium"+ "_dust", "K");
    public static final ChemicalDust POTASSIUM_OXIDE = new ChemicalDust("Potassium_oxide", "K2O");
    public static final ChemicalDust CALCIUM_DUST = new ChemicalDust("Calcium"+ "_dust", "Ca");
    public static final ChemicalDust SCANDIUM_DUST = new ChemicalDust("Scandium"+ "_dust", "Sc");
    public static final ChemicalDust TITANIUM_DUST = new ChemicalDust("Titanium"+ "_dust", "Ti");
    public static final ChemicalDust VANADIUM_DUST = new ChemicalDust("Vanadium"+ "_dust", "V");
    public static final ChemicalDust CHROMIUM_DUST = new ChemicalDust("Chromium"+ "_dust", "Cr");
    public static final ChemicalDust MANGANESE_DUST = new ChemicalDust("Manganese"+ "_dust", "Mn");
    public static final ChemicalDust IRON_DUST = new ChemicalDust("Iron_dust", "Fe");
    public static final ChemicalDust IRON_OXIDE = new ChemicalDust("Iron_oxide(II)", "FeO");
    public static final ChemicalDust COBALT_DUST = new ChemicalDust("Cobalt"+ "_dust", "Co");
    public static final ChemicalDust NICKEL_DUST = new ChemicalDust("Nickel"+ "_dust", "Ni");
    public static final ChemicalDust COPPER_DUST = new ChemicalDust("Copper"+ "_dust", "Cu");
    public static final ChemicalDust COPPER_OXIDE = new ChemicalDust("Copper_oxide(II)", "CuO", 1);
    public static final ChemicalDust ZINC_DUST = new ChemicalDust("Zinc"+ "_dust", "Zn");
    public static final ChemicalDust GALLIUM_DUST = new ChemicalDust("Gallium"+ "_dust", "Ga");
    public static final ChemicalDust GERMANIUM_DUST = new ChemicalDust("Germanium"+ "_dust", "Ge");
    public static final ChemicalDust ARSENIC_DUST = new ChemicalDust("Arsenic"+ "_dust", "As");
    public static final ChemicalDust SELENIUM_DUST = new ChemicalDust("Selenium"+ "_dust", "Se");
    public static final ChemicalDust RUBIDIUM_DUST = new ChemicalDust("Rubidium"+ "_dust", "Rb");
    public static final ChemicalDust STRONTIUM_DUST = new ChemicalDust("Strontium"+ "_dust", "Sr");
    public static final ChemicalDust YTTRIUM_DUST = new ChemicalDust("Yttrium"+ "_dust", "Y");
    public static final ChemicalDust ZIRCONIUM_DUST = new ChemicalDust("Zirconium"+ "_dust", "Zr");
    public static final ChemicalDust NIOBIUM_DUST = new ChemicalDust("Niobium"+ "_dust", "Nb");
    public static final ChemicalDust MOLYBDENUM_DUST = new ChemicalDust("Molybdenum"+ "_dust", "Mo");
    public static final ChemicalDust TECHNETIUM_DUST = new ChemicalDust("Technetium"+ "_dust", "Tc");
    public static final ChemicalDust RUTHENIUM_DUST = new ChemicalDust("Ruthenium"+ "_dust", "Ru");
    public static final ChemicalDust RHODIUM_DUST = new ChemicalDust("Rhodium"+ "_dust", "Rh");
    public static final ChemicalDust PALLADIUM_DUST = new ChemicalDust("Palladium"+ "_dust", "Pd");
    public static final ChemicalDust SILVER_DUST = new ChemicalDust("Silver"+ "_dust", "Ag");
    public static final ChemicalDust CADMIUM_DUST = new ChemicalDust("Cadmium"+ "_dust", "Cd");
    public static final ChemicalDust INDIUM_DUST = new ChemicalDust("Indium"+ "_dust", "In");
    public static final ChemicalDust TIN_DUST = new ChemicalDust("Tin"+ "_dust", "Sn");
    public static final ChemicalDust ANTIMONY_DUST = new ChemicalDust("Antimony"+ "_dust", "Sb");
    public static final ChemicalDust TELLURIUM_DUST = new ChemicalDust("Tellurium"+ "_dust", "Te");
    public static final ChemicalDust CAESIUM_DUST = new ChemicalDust("Caesium"+ "_dust", "Cs");
    public static final ChemicalDust BARIUM_DUST = new ChemicalDust("Barium"+ "_dust", "Ba");
    public static final ChemicalDust LANTHANUM_DUST = new ChemicalDust("Lanthanum"+ "_dust", "La");
    public static final ChemicalDust CERIUM_DUST = new ChemicalDust("Cerium"+ "_dust", "Ce");
    public static final ChemicalDust PRASEODYMIUM_DUST = new ChemicalDust("Praseodymium"+ "_dust", "Pr");
    public static final ChemicalDust NEODYMIUM_DUST = new ChemicalDust("Neodymium"+ "_dust", "Nd");
    public static final ChemicalDust PROMETHIUM_DUST = new ChemicalDust("Promethium"+ "_dust", "Pm");
    public static final ChemicalDust SAMARIUM_DUST = new ChemicalDust("Samarium"+ "_dust", "Sm");
    public static final ChemicalDust EUROPIUM_DUST = new ChemicalDust("Europium"+ "_dust", "Eu");
    public static final ChemicalDust GADOLINIUM_DUST = new ChemicalDust("Gadolinium"+ "_dust", "Gd");
    public static final ChemicalDust TERBIUM_DUST = new ChemicalDust("Terbium"+ "_dust", "Tb");
    public static final ChemicalDust DYSPROSIUM_DUST = new ChemicalDust("Dysprosium"+ "_dust", "Dy");
    public static final ChemicalDust HOLMIUM_DUST = new ChemicalDust("Holmium"+ "_dust", "Ho");
    public static final ChemicalDust ERBIUM_DUST = new ChemicalDust("Erbium"+ "_dust", "Er");
    public static final ChemicalDust THULIUM_DUST = new ChemicalDust("Thulium"+ "_dust", "Tm");
    public static final ChemicalDust YTTERBIUM_DUST = new ChemicalDust("Ytterbium"+ "_dust", "Yb");
    public static final ChemicalDust LUTETIUM_DUST = new ChemicalDust("Lutetium"+ "_dust", "Lu");
    public static final ChemicalDust TANTALUM_DUST = new ChemicalDust("Tantalum"+ "_dust", "Ta");
    public static final ChemicalDust IRON_TUNGSTEN_DUST = new ChemicalDust("Iron_tungsten", "FeWO4");
    public static final ChemicalDust TUNGSTEN_DUST = new ChemicalDust("Tungsten"+ "_dust", "W");
    public static final ChemicalDust RHENIUM_DUST = new ChemicalDust("Rhenium"+ "_dust", "Re");
    public static final ChemicalDust OSMIUM_DUST = new ChemicalDust("Osmium"+ "_dust", "Os");
    public static final ChemicalDust IRIDIUM_DUST = new ChemicalDust("Iridium"+ "_dust", "Ir");
    public static final ChemicalDust PLATINUM_DUST = new ChemicalDust("Platinum"+ "_dust", "Pt");
    public static final ChemicalDust GOLD_DUST = new ChemicalDust("Gold"+ "_dust", "Au");
    public static final ChemicalDust THALLIUM_DUST = new ChemicalDust("Thallium"+ "_dust", "Ti");
    public static final ChemicalDust LEAD_DUST = new ChemicalDust("Lead"+ "_dust", "Pb");
    public static final ChemicalDust BISMUTH_DUST = new ChemicalDust("Bismuth"+ "_dust", "Bi");
    public static final ChemicalDust POLONIUM_DUST = new ChemicalDust("Polonium"+ "_dust", "Po");
    public static final ChemicalDust ASTATINE_DUST = new ChemicalDust("Astatine"+ "_dust", "At");
    public static final ChemicalDust FRANCIUM_DUST = new ChemicalDust("Francium"+ "_dust", "Fr");
    public static final ChemicalDust RADIUM_DUST = new ChemicalDust("Radium"+ "_dust", "Ra");
    public static final ChemicalDust ACTINIUM_DUST = new ChemicalDust("Actinium"+ "_dust", "Ac");
    public static final ChemicalDust THORIUM_DUST = new ChemicalDust("Thorium"+ "_dust", "Th");
    public static final ChemicalDust PROTACTINIUM_DUST = new ChemicalDust("Protactinium"+ "_dust", "Pa");
    public static final ChemicalDust URANIUM_DUST = new ChemicalDust("Uranium"+ "_dust", "U");
    public static final ChemicalDust NEPTUNIUM_DUST = new ChemicalDust("Neptunium"+ "_dust", "Np");
    public static final ChemicalDust PLUTONIUM_DUST = new ChemicalDust("Plutonium"+ "_dust", "Pu");
    public static final ChemicalDust AMERICIUM_DUST = new ChemicalDust("Americium"+ "_dust", "Am");
    public static final ChemicalDust CURIUM_DUST = new ChemicalDust("Curium"+ "_dust", "Cm");
    public static final ChemicalDust BERKELIUM_DUST = new ChemicalDust("Berkelium"+ "_dust", "Bk");
    public static final ChemicalDust CALIFORNIUM_DUST = new ChemicalDust("Californium"+ "_dust", "Cf");
    public static final ChemicalDust EINSTEINIUM_DUST = new ChemicalDust("Einsteinium"+ "_dust", "Es");
    public static final ChemicalDust FERMIUM_DUST = new ChemicalDust("Fermium"+ "_dust", "Fm");
    public static final ChemicalDust MENDELEVIUM_DUST = new ChemicalDust("Mendelevium"+ "_dust", "Md");
    public static final ChemicalDust NOBELIUM_DUST = new ChemicalDust("Nobelium"+ "_dust", "No");
    public static final ChemicalDust LAWRENCIUM_DUST = new ChemicalDust("Lawrencium"+ "_dust", "Lr");
    //endregion

    // region Ѕлоки (–уда)
    public static final Magnetite_ores MAGNETITE_ORES = new Magnetite_ores();
    public static final ChemicalOres BERYL_ORE = new ChemicalOres("Beryl"+"_ore", RegisterHimical.Beryl_dust, 2);
    public static final ChemicalOres CHRYSOBERYL_ORE = new ChemicalOres("Chrysoberyl"+"_ore", RegisterHimical.CHRYSOBERYL_DUST, 2);
    public static final ChemicalOres BERTRANDITE_ORE = new ChemicalOres("Bertrandite"+"_ore", RegisterHimical.BERTRANDITE_DUST, 2);
    public static final ChemicalOres HEMATITE_ORE = new ChemicalOres("Hematite"+"_ore", RegisterHimical.HEMATITE_DUST, 2);
    public static final ChemicalOres LIMONITE_ORE = new ChemicalOres("Limonite"+"_ore", RegisterHimical.LIMONITE_DUST, 2);
    public static final ChemicalOres CHALCOPYRITE_ORE = new ChemicalOres("Chalcopyrite"+"_ore", RegisterHimical.CHALCOPYRITE_DUST, 2);
    public static final ChemicalOres CHALCOSINE_ORE = new ChemicalOres("Chalcosine"+"_ore", RegisterHimical.CHALCOSINE_DUST, 2);
    public static final ChemicalOres COVELLIN_ORE = new ChemicalOres("Covellin"+"_ore", RegisterHimical.COVELLIN_DUST, 2);
    public static final ChemicalOres BORNITE_ORE = new ChemicalOres("Bornite"+"_ore", RegisterHimical.BORNITE_DUST, 2);
    public static final ChemicalOres TETRAHEDRITE_ORE = new ChemicalOres("Tetrahedrite"+"_ore", RegisterHimical.TETRAHEDRITE_DUST, 2);
    public static final ChemicalOres MALACHITE_ORE = new ChemicalOres("Malachite"+"_ore", RegisterHimical.MALACHITE_DUST, 2);
    public static final ChemicalOres AZURITE_ORE = new ChemicalOres("Azurite"+"_ore", RegisterHimical.AZURITE_DUST, 2);
    public static final ChemicalOres KUPRIT_ORE = new ChemicalOres("Kuprit"+"_ore", RegisterHimical.KUPRIT_DUST, 2);
    public static final ChemicalOres CHRYSOCOLLA_ORE = new ChemicalOres("Chrysocolla"+"_ore", RegisterHimical.CHRYSOCOLLA_DUST, 2);
    public static final ChemicalOres FERBERITE_ORE = new ChemicalOres("Ferberite"+"_ore", RegisterHimical.FERBERITE_DUST, 2);
    public static final ChemicalOres HUBNERITE_ORE = new ChemicalOres("Hubnerite"+"_ore", RegisterHimical.HUBNERITE_DUST, 2);
    public static final ChemicalOres NEPHELINE_ORE = new ChemicalOres("Nepheline"+"_ore", RegisterHimical.NEPHELINE_DUST, 2);

    //endregion


    public static void register(){
        //region Ёлементы
        // 1 период
        GameRegistry.registerItem(HYDROGEN, "Hydrogen");
        GameRegistry.registerItem(HELIUM, "Helium");
        // 2 период
        GameRegistry.registerItem(LITHIUM, "Lithium");
        GameRegistry.registerItem(BERYLLIUM, "Beryllium");
        GameRegistry.registerItem(BORON, "Boron");
        GameRegistry.registerItem(CARBON, "Carbon");
        GameRegistry.registerItem(NITROGEN, "Nitrogen");
        GameRegistry.registerItem(OXYGEN, "Oxygen");
        GameRegistry.registerItem(FLUORINE, "Fluorine");
        GameRegistry.registerItem(NEON, "Neon");
        // 3 период
        GameRegistry.registerItem(SODIUM, "Sodium");
        GameRegistry.registerItem(MAGNESIUM, "Magnesium");
        GameRegistry.registerItem(ALUMINIUM, "Aluminium");
        GameRegistry.registerItem(SILICON, "Silicon");
        GameRegistry.registerItem(PHOSPHORUS, "Phosphorus");
        GameRegistry.registerItem(SULFUR, "Sulfur");
        GameRegistry.registerItem(CHLORINE, "Chlorine");
        GameRegistry.registerItem(ARGON, "Argon");
        // 4 период
        GameRegistry.registerItem(POTASSIUM, "Potassium");
        GameRegistry.registerItem(CALCIUM, "Calcium");
        GameRegistry.registerItem(SCANDIUM, "Scandium");
        GameRegistry.registerItem(TITANIUM, "Titanium");
        GameRegistry.registerItem(VANADIUM, "Vanadium");
        GameRegistry.registerItem(CHROMIUM, "Chromium");
        GameRegistry.registerItem(MANGANESE, "Manganese");
        GameRegistry.registerItem(IRON, "Iron");
        GameRegistry.registerItem(COBALT, "Cobalt");
        GameRegistry.registerItem(NICKEL, "Nickel");
        GameRegistry.registerItem(COPPER, "Copper");
        GameRegistry.registerItem(ZINC, "Zinc");
        GameRegistry.registerItem(GALLIUM, "Gallium");
        GameRegistry.registerItem(GERMANIUM, "Germanium");
        GameRegistry.registerItem(ARSENIC, "Arsenic");
        GameRegistry.registerItem(SELENIUM, "Selenium");
        GameRegistry.registerItem(BROMINE, "Bromine");
        GameRegistry.registerItem(KRYPTON, "Krypton");
        //5 период
        GameRegistry.registerItem(RUBIDIUM, "Rubidium");
        GameRegistry.registerItem(STRONTIUM, "Strontium");
        GameRegistry.registerItem(YTTRIUM, "Yttrium");
        GameRegistry.registerItem(ZIRCONIUM, "Zirconium");
        GameRegistry.registerItem(NIOBIUM, "Niobium");
        GameRegistry.registerItem(MOLYBDENUM, "Molybdenum");
        GameRegistry.registerItem(TECHNETIUM, "Technetium");
        GameRegistry.registerItem(RUTHENIUM, "Ruthenium");
        GameRegistry.registerItem(RHODIUM, "Rhodium");
        GameRegistry.registerItem(PALLADIUM, "Palladium");
        GameRegistry.registerItem(SILVER, "Silver");
        GameRegistry.registerItem(CADMIUM, "Cadmium");
        GameRegistry.registerItem(INDIUM, "Indium");
        GameRegistry.registerItem(TIN, "Tin");
        GameRegistry.registerItem(ANTIMONY, "Antimony");
        GameRegistry.registerItem(TELLURIUM, "Tellurium");
        GameRegistry.registerItem(IODINE, "Iodine");
        GameRegistry.registerItem(XENON, "Xenon");
        //6 период
        GameRegistry.registerItem(CAESIUM, "Caesium");
        GameRegistry.registerItem(BARIUM, "Barium");
        GameRegistry.registerItem(LANTHANUM, "Lanthanum");
        GameRegistry.registerItem(CERIUM, "Cerium");
        GameRegistry.registerItem(PRASEODYMIUM, "Praseodymium");
        GameRegistry.registerItem(NEODYMIUM, "Neodymium");
        GameRegistry.registerItem(PROMETHIUM, "Promethium");
        GameRegistry.registerItem(SAMARIUM, "Samarium");
        GameRegistry.registerItem(EUROPIUM, "Europium");
        GameRegistry.registerItem(GADOLINIUM, "Gadolinium");
        GameRegistry.registerItem(TERBIUM, "Terbium");
        GameRegistry.registerItem(DYSPROSIUM, "Dysprosium");
        GameRegistry.registerItem(HOLMIUM, "Holmium");
        GameRegistry.registerItem(ERBIUM, "Erbium");
        GameRegistry.registerItem(THULIUM, "Thulium");
        GameRegistry.registerItem(YTTERBIUM, "Ytterbium");
        GameRegistry.registerItem(LUTETIUM, "Lutetium");
        GameRegistry.registerItem(TANTALUM, "Tantalum");
        GameRegistry.registerItem(TUNGSTEN, "Tungsten");
        GameRegistry.registerItem(RHENIUM, "Rhenium");
        GameRegistry.registerItem(OSMIUM, "Osmium");
        GameRegistry.registerItem(IRIDIUM, "Iridium");
        GameRegistry.registerItem(PLATINUM, "Platinum");
        GameRegistry.registerItem(GOLD, "Gold");
        GameRegistry.registerItem(MERCURY, "Mercury");
        GameRegistry.registerItem(THALLIUM, "Thallium");
        GameRegistry.registerItem(LEAD, "Lead");
        GameRegistry.registerItem(BISMUTH, "Bismuth");
        GameRegistry.registerItem(POLONIUM, "Polonium");
        GameRegistry.registerItem(ASTATINE, "Astatine");
        GameRegistry.registerItem(RADON, "Radon");
        //7 период
        GameRegistry.registerItem(FRANCIUM, "Francium");
        GameRegistry.registerItem(RADIUM, "Radium");
        GameRegistry.registerItem(ACTINIUM, "Actinium");
        GameRegistry.registerItem(THORIUM, "Thorium");
        GameRegistry.registerItem(PROTACTINIUM, "Protactinium");
        GameRegistry.registerItem(URANIUM, "Uranium");
        GameRegistry.registerItem(NEPTUNIUM, "Neptunium");
        GameRegistry.registerItem(PLUTONIUM, "Plutonium");
        GameRegistry.registerItem(AMERICIUM, "Americium");
        GameRegistry.registerItem(CURIUM, "Curium");
        GameRegistry.registerItem(BERKELIUM, "Berkelium");
        GameRegistry.registerItem(CALIFORNIUM, "Californium");
        GameRegistry.registerItem(EINSTEINIUM, "Einsteinium");
        GameRegistry.registerItem(FERMIUM, "Fermium");
        GameRegistry.registerItem(MENDELEVIUM, "Mendelevium");
        GameRegistry.registerItem(NOBELIUM, "Nobelium");
        GameRegistry.registerItem(LAWRENCIUM, "Lawrencium");
        //endregion

        //region ѕыль элементов
        GameRegistry.registerItem(LITHIUM_DUST, "Lithium_dust");
        GameRegistry.registerItem(Beryllium_dust, "Beryllium_dust");
        GameRegistry.registerItem(BERYLLIUM_OXIDE, "Beryllium_oxide");
        GameRegistry.registerItem(BORON_DUST, "Boron_dust");
        GameRegistry.registerItem(CARBON_DUST, "Carbon_dust");
        GameRegistry.registerItem(SODIUM_DUST, "Sodium_dust");
        GameRegistry.registerItem(SODIUM_OXIDE, "Sodium_oxide");
        GameRegistry.registerItem(MAGNESIUM_DUST, "Magnesium_dust");
        GameRegistry.registerItem(ALUMINUM_DUST, "Aluminum_dust");
        GameRegistry.registerItem(ALUMINUM_OXIDE, "Aluminum_oxide");
        GameRegistry.registerItem(SILICON_DUST, "Silicon_dust");
        GameRegistry.registerItem(PHOSPHORUS_DUST, "Phosphorus_dust");
        GameRegistry.registerItem(SULFUR_DUST, "Sulfur_dust");
        GameRegistry.registerItem(POTASSIUM_DUST, "Potassium_dust");
        GameRegistry.registerItem(POTASSIUM_OXIDE, "Potassium_oxide");
        GameRegistry.registerItem(CALCIUM_DUST, "Calcium_dust");
        GameRegistry.registerItem(SCANDIUM_DUST, "Scandium_dust");
        GameRegistry.registerItem(TITANIUM_DUST, "Titanium_dust");
        GameRegistry.registerItem(VANADIUM_DUST, "Vanadium_dust");
        GameRegistry.registerItem(CHROMIUM_DUST, "Chromium_dust");
        GameRegistry.registerItem(MANGANESE_DUST, "Manganese_dust");
        GameRegistry.registerItem(IRON_DUST, "Iron_dust");
        GameRegistry.registerItem(IRON_OXIDE, "Iron_oxide");
        GameRegistry.registerItem(COBALT_DUST, "Cobalt_dust");
        GameRegistry.registerItem(NICKEL_DUST, "Nickel_dust");
        GameRegistry.registerItem(COPPER_DUST, "Copper_dust");
        GameRegistry.registerItem(COPPER_OXIDE, "Copper_oxide");
        GameRegistry.registerItem(ZINC_DUST, "Zinc_dust");
        GameRegistry.registerItem(GALLIUM_DUST, "Gallium_dust");
        GameRegistry.registerItem(GERMANIUM_DUST, "Germanium_dust");
        GameRegistry.registerItem(ARSENIC_DUST, "Arsenic_dust");
        GameRegistry.registerItem(SELENIUM_DUST, "Selenium_dust");
        GameRegistry.registerItem(RUBIDIUM_DUST, "Rubidium_dust");
        GameRegistry.registerItem(STRONTIUM_DUST, "Strontium_dust");
        GameRegistry.registerItem(YTTRIUM_DUST, "Yttrium_dust");
        GameRegistry.registerItem(ZIRCONIUM_DUST, "Zirconium_dust");
        GameRegistry.registerItem(NIOBIUM_DUST, "Niobium_dust");
        GameRegistry.registerItem(MOLYBDENUM_DUST, "Molybdenum_dust");
        GameRegistry.registerItem(TECHNETIUM_DUST, "Technetium_dust");
        GameRegistry.registerItem(RUTHENIUM_DUST, "Ruthenium_dust");
        GameRegistry.registerItem(RHODIUM_DUST, "Rhodium_dust");
        GameRegistry.registerItem(PALLADIUM_DUST, "Palladium_dust");
        GameRegistry.registerItem(SILVER_DUST, "Silver_dust");
        GameRegistry.registerItem(CADMIUM_DUST, "Cadmium_dust");
        GameRegistry.registerItem(INDIUM_DUST, "Indium_dust");
        GameRegistry.registerItem(TIN_DUST, "Tin_dust");
        GameRegistry.registerItem(ANTIMONY_DUST, "Antimony_dust");
        GameRegistry.registerItem(TELLURIUM_DUST, "Tellurium_dust");
        GameRegistry.registerItem(CAESIUM_DUST, "Caesium_dust");
        GameRegistry.registerItem(BARIUM_DUST, "Barium_dust");
        GameRegistry.registerItem(LANTHANUM_DUST, "Lanthanum_dust");
        GameRegistry.registerItem(CERIUM_DUST, "Cerium_dust");
        GameRegistry.registerItem(PRASEODYMIUM_DUST, "Praseodymium_dust");
        GameRegistry.registerItem(NEODYMIUM_DUST, "Neodymium_dust");
        GameRegistry.registerItem(PROMETHIUM_DUST, "Promethium_dust");
        GameRegistry.registerItem(SAMARIUM_DUST, "Samarium_dust");
        GameRegistry.registerItem(EUROPIUM_DUST, "Europium_dust");
        GameRegistry.registerItem(GADOLINIUM_DUST, "Gadolinium_dust");
        GameRegistry.registerItem(TERBIUM_DUST, "Terbium_dust");
        GameRegistry.registerItem(DYSPROSIUM_DUST, "Dysprosium_dust");
        GameRegistry.registerItem(HOLMIUM_DUST, "Holmium_dust");
        GameRegistry.registerItem(ERBIUM_DUST, "Erbium_dust");
        GameRegistry.registerItem(THULIUM_DUST, "Thulium_dust");
        GameRegistry.registerItem(YTTERBIUM_DUST, "Ytterbium_dust");
        GameRegistry.registerItem(LUTETIUM_DUST, "Lutetium_dust");
        GameRegistry.registerItem(TANTALUM_DUST, "Tantalum_dust");
        GameRegistry.registerItem(IRON_TUNGSTEN_DUST, "Iron_tungsten_dust");
        GameRegistry.registerItem(TUNGSTEN_DUST, "Tungsten_dust");
        GameRegistry.registerItem(RHENIUM_DUST, "Rhenium_dust");
        GameRegistry.registerItem(OSMIUM_DUST, "Osmium_dust");
        GameRegistry.registerItem(IRIDIUM_DUST, "Iridium_dust");
        GameRegistry.registerItem(PLATINUM_DUST, "Platinum_dust");
        GameRegistry.registerItem(GOLD_DUST, "Gold_dust");
        GameRegistry.registerItem(THALLIUM_DUST, "Thallium_dust");
        GameRegistry.registerItem(LEAD_DUST, "Lead_dust");
        GameRegistry.registerItem(BISMUTH_DUST, "Bismuth_dust");
        GameRegistry.registerItem(POLONIUM_DUST, "Polonium_dust");
        GameRegistry.registerItem(ASTATINE_DUST, "Astatine_dust");
        GameRegistry.registerItem(FRANCIUM_DUST, "Francium_dust");
        GameRegistry.registerItem(RADIUM_DUST, "Radium_dust");
        GameRegistry.registerItem(ACTINIUM_DUST, "Actinium_dust");
        GameRegistry.registerItem(THORIUM_DUST, "Thorium_dust");
        GameRegistry.registerItem(PROTACTINIUM_DUST, "Protactinium_dust");
        GameRegistry.registerItem(URANIUM_DUST, "Uranium_dust");
        GameRegistry.registerItem(NEPTUNIUM_DUST, "Neptunium_dust");
        GameRegistry.registerItem(PLUTONIUM_DUST, "Plutonium_dust");
        GameRegistry.registerItem(AMERICIUM_DUST, "Americium_dust");
        GameRegistry.registerItem(CURIUM_DUST, "Curium_dust");
        GameRegistry.registerItem(BERKELIUM_DUST, "Berkelium_dust");
        GameRegistry.registerItem(CALIFORNIUM_DUST, "Californium_dust");
        GameRegistry.registerItem(EINSTEINIUM_DUST, "Einsteinium_dust");
        GameRegistry.registerItem(FERMIUM_DUST, "Fermium_dust");
        GameRegistry.registerItem(MENDELEVIUM_DUST, "Mendelevium_dust");
        GameRegistry.registerItem(NOBELIUM_DUST, "Nobelium_dust");
        GameRegistry.registerItem(LAWRENCIUM_DUST, "Lawrencium_dust");
        //endregion

        //region ѕыль руды
        GameRegistry.registerItem(Beryl_dust, "Beryl_dust");
        GameRegistry.registerItem(CHRYSOBERYL_DUST, "Chrysoberyl_dust");
        GameRegistry.registerItem(BERTRANDITE_DUST, "Bertrandite_dust");
        GameRegistry.registerItem(HEMATITE_DUST, "Hematite_dust");
        GameRegistry.registerItem(LIMONITE_DUST, "Limonite_dust");
        GameRegistry.registerItem(CHALCOPYRITE_DUST, "Chalcopyrite_dust");
        GameRegistry.registerItem(CHALCOSINE_DUST, "Chalcosine_dust");
        GameRegistry.registerItem(COVELLIN_DUST, "Covellin_dust");
        GameRegistry.registerItem(BORNITE_DUST, "Bornite_dust");
        GameRegistry.registerItem(TETRAHEDRITE_DUST, "Tetrahedrite_dust");
        GameRegistry.registerItem(MALACHITE_DUST, "Malachite_dust");
        GameRegistry.registerItem(AZURITE_DUST, "Azurite_dust");
        GameRegistry.registerItem(KUPRIT_DUST, "Kuprit_dust");
        GameRegistry.registerItem(CHRYSOCOLLA_DUST, "Chrysocolla_dust");
        GameRegistry.registerItem(FERBERITE_DUST, "Ferberite_dust");
        GameRegistry.registerItem(HUBNERITE_DUST, "Hubnerite_dust");
        GameRegistry.registerItem(NEPHELINE_DUST, "Nepheline_dust");
        //endregion

        //region –уды
        GameRegistry.registerBlock(MAGNETITE_ORES, "Magnetite");
        GameRegistry.registerBlock(BERYL_ORE, "Beryl_ore");
        GameRegistry.registerBlock(CHRYSOBERYL_ORE, "Chrysoberyl_ore");
        GameRegistry.registerBlock(BERTRANDITE_ORE, "Bertrandite_ore");
        GameRegistry.registerBlock(HEMATITE_ORE, "Hematite_ore");
        GameRegistry.registerBlock(LIMONITE_ORE, "Limonite_ore");
        GameRegistry.registerBlock(CHALCOPYRITE_ORE, "Chalcopyrite_ore");
        GameRegistry.registerBlock(CHALCOSINE_ORE, "Chalcosine_ore");
        GameRegistry.registerBlock(COVELLIN_ORE, "Covellin_ore");
        GameRegistry.registerBlock(BORNITE_ORE, "Bornite_ore");
        GameRegistry.registerBlock(TETRAHEDRITE_ORE, "Tetrahedrite_ore");
        GameRegistry.registerBlock(MALACHITE_ORE, "Malachite_ore");
        GameRegistry.registerBlock(AZURITE_ORE, "Azurite_ore");
        GameRegistry.registerBlock(KUPRIT_ORE, "Kuprit_ore");
        GameRegistry.registerBlock(CHRYSOCOLLA_ORE, "Chrysocolla_ore");
        GameRegistry.registerBlock(FERBERITE_ORE, "Ferberite_ore");
        GameRegistry.registerBlock(HUBNERITE_ORE, "Hubnerite_ore");
        GameRegistry.registerBlock(NEPHELINE_ORE, "Nepheline_ore");
        //endregion

    }
}
