package cn.javass.dp.state.example5;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        VoteState state = new NormalVoteState();
        VoteManagerContext context = new VoteManagerContext();
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
        context.vote("张三", "1");
    }
}
