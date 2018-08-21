package Bohr.Handlers;

import static Bohr.Helper.BohrHelper.modelMaker;
import static Bohr.Handlers.BohrMaterialHandler.BOHR;

import Bohr.Items.Tools.BohrShovel;
import Bohr.Items.Tools.BohrPickAxe;
import Bohr.Items.Tools.BohrHoe;
import Bohr.Items.Tools.BohrAxe;
import net.minecraft.creativetab.CreativeTabs;

public class BohrToolHandler {

  public static BohrPickAxe bohrPickAxe;
  private static String lang_bohr_pick_axe = "loc_bohr_pick_axe";
  private static String reg_bohr_pick_axe = "bohr_pick_axe";

  public static BohrShovel bohrShovel;
  private static String lang_bohr_shovel = "loc_bohr_shovel";
  private static String reg_bohr_shovel = "bohr_shovel";

  public static BohrHoe bohrHoe;
  private static String lang_bohr_hoe = "loc_bohr_hoe";
  private static String reg_bohr_hoe = "bohr_hoe";

  public static BohrAxe bohrAxe;
  private static String lang_bohr_axe = "loc_bohr_axe";
  private static String reg_bohr_axe = "bohr_axe";

  public static void preInit() {
    bohrPickAxe = new BohrPickAxe(lang_bohr_pick_axe, reg_bohr_pick_axe,64,
        BOHR,  CreativeTabs.TOOLS);
    modelMaker(bohrPickAxe);

    bohrShovel = new BohrShovel(lang_bohr_shovel, reg_bohr_shovel, 64,
        BOHR, CreativeTabs.TOOLS);
    modelMaker(bohrShovel);

    bohrHoe = new BohrHoe(lang_bohr_hoe, reg_bohr_hoe, 64, BOHR, CreativeTabs.TOOLS);
    modelMaker(bohrHoe);

    bohrAxe = new BohrAxe(lang_bohr_axe, reg_bohr_axe, 64, BOHR, CreativeTabs.TOOLS);
    modelMaker(bohrAxe);
  }

  public static void init() {}
  public static void postInit() {}
}
