package VanillaPathPlus;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.engine.registries.TileRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.level.gameTile.PathTiledTile;

import java.awt.*;

@ModEntry
public class VanillaPathPlus {

    public void init() {
        System.out.println("Registering more tiles.. For more fun!");
        TileRegistry.registerTile("deepstonebrickpathtile", new PathTiledTile("deepstonebrickpath", new Color(57, 59, 60)), 5.0F, true);
        TileRegistry.registerTile("deepstonepathtile", new PathTiledTile("deepstonepath", new Color(57, 59, 60)), 5.0F, true);
        TileRegistry.registerTile("deepstonetiledpathtile", new PathTiledTile("deepstonetiledpath", new Color(57, 59, 60)), 5.0F, true);

        TileRegistry.registerTile("dungeonpathtile", new PathTiledTile("dungeonpath", new Color(53, 54, 59)), 5.0F, true);

        TileRegistry.registerTile("palmpathtile", new PathTiledTile("palmpath", new Color(138, 106, 51)), 5.0F, true);
        TileRegistry.registerTile("pinepathtile", new PathTiledTile("pinepath", new Color(117, 86, 41)), 5.0F, true);

        TileRegistry.registerTile("sandstonebrickpathtile", new PathTiledTile("sandstonebrickpath", new Color(216, 205, 171)), 5.0F, true);

        TileRegistry.registerTile("snowstonebrickpathtile", new PathTiledTile("snowstonebrickpath", new Color(176, 176, 176)), 5.0F, true);

        TileRegistry.registerTile("stonebrickpathtile", new PathTiledTile("stonebrickpath", new Color(107, 107, 107)), 5.0F, true);
        TileRegistry.registerTile("stonetiledpathtile", new PathTiledTile("stonetiledpath", new Color(107, 107, 107)), 5.0F, true);

        TileRegistry.registerTile("swampstonebrickpathtile", new PathTiledTile("swampstonebrickpath", new Color(81, 88, 81)), 5.0F, true);
    }

    public void postInit() {
        System.out.println("Making recipe for each tiles so you can craft them :)");
        Recipes.registerModRecipe(new Recipe(
                "deepstonebrickpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("deepstone", 2)}
        ));
        Recipes.registerModRecipe(new Recipe(
                "deepstonepathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("deepstone", 2)}
        ));
        Recipes.registerModRecipe(new Recipe(
                "deepstonetiledpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("deepstone", 2)}
        ));

        Recipes.registerModRecipe(new Recipe(
                "dungeonpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("dungeonfloor", 2)}
        ));

        Recipes.registerModRecipe(new Recipe(
                "palmpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("palmlog", 2)}
        ));
        Recipes.registerModRecipe(new Recipe(
                "pinepathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("pinelog", 2)}
        ));

        Recipes.registerModRecipe(new Recipe(
                "sandstonebrickpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("sandstone", 2)}
        ));

        Recipes.registerModRecipe(new Recipe(
                "snowstonebrickpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("snowstone", 2)}
        ));

        Recipes.registerModRecipe(new Recipe(
                "stonebrickpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("stone", 2)}
        ));
        Recipes.registerModRecipe(new Recipe(
                "stonetiledpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("stone", 2)}
        ));

        Recipes.registerModRecipe(new Recipe(
                "swampstonebrickpathtile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]{new Ingredient("swampstone", 2)}
        ));
    }

}
