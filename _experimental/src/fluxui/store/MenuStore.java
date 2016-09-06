package fluxui.store;

import fluxui.action.Action;
import fluxui.action.ActionType;
import fluxui.action.MenuAction;
import fluxui.action.MenuItem;
/**
 * Created by Cronixx on 06.09.2016.
 */
public class MenuStore extends Store {

    private MenuItem selected = MenuItem.HOME;

    @Override
    public void onAction(Action action) {
        if (action.getType().equals(ActionType.MENU_ITEM_SELECTED)) {
            MenuAction menuAction = (MenuAction) action;
            selected = menuAction.getMenuItem();
            notifyChange();
        }
    }

    public MenuItem getSelected() {
        return selected;
    }
}
