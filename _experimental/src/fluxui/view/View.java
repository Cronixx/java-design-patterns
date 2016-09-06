package fluxui.view;
import fluxui.store.Store;
/**
 * Created by Cronixx on 06.09.2016.
 */

public interface View {

    void storeChanged(Store store);

    void render();
}
