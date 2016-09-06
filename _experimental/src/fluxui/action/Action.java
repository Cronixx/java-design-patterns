package fluxui.action;

/**
 * Created by Cronixx on 06.09.2016.
 */
public abstract class Action {
    private ActionType type;

    public Action(ActionType type) {
        this.type = type;
    }

    public ActionType getType() {
        return type;
    }
}
