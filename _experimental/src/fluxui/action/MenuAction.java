package fluxui.action;

/**
 * Created by Cronixx on 06.09.2016.
 */
public class MenuAction extends Action {

    private MenuItem menuItem;

    public MenuAction(MenuItem menuItem) {
        super(ActionType.MENU_ITEM_SELECTED);
        this.menuItem = menuItem;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }
}
