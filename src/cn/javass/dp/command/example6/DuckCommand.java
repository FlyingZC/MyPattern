package cn.javass.dp.command.example6;

/**
 * 命令对象，北京烤鸭
 */
public class DuckCommand implements Command {
    private CookApi cookApi = null;
    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    public int getTableNum() {
        return this.tableNum;
    }

    public void execute() {
        this.cookApi.cook(tableNum, "北京烤鸭" );
    }
}
