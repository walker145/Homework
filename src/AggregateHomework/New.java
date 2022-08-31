package AggregateHomework;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class New {
    private String title;
    private String content;


    public New(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "title='" + title;
    }
    //写一个方法处理实现新闻标题
    public static String processTitle(String title){
        if (title == null){
            return "";
        }

        if (title.length() > 15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
