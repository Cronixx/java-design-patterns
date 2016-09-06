package fluxui.store;

/**
 * Created by Cronixx on 06.09.2016.
 */

import java.util.LinkedList;
import java.util.List;

import fluxui.action.Action;
import fluxui.view.View;
/**
 *
 * Store is a data model.
 *
 */
public abstract class Store {

    private List<View> views = new LinkedList<>();

    public abstract void onAction(Action action);

    public void registerView(View view) {
        views.add(view);
    }

    protected void notifyChange() {
        views.stream().forEach(view -> view.storeChanged(this));
    }
}