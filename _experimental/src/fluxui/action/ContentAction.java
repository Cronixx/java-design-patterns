package fluxui.action;

/**
 * Created by Cronixx on 06.09.2016.
 */
public class ContentAction extends Action {
    private Content content;

    public ContentAction(Content content) {
        super(ActionType.CONTENT_CHANGED);
        this.content = content;
    }

    public Content getContent() {
        return content;
    }
}
