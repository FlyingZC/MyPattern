注意!!cn.javass.dp下的编码为gbk,已改为uft-8
一.简单工厂模式
simplefactory
就是一个工厂类里有一个静态方法,用于根据传入的参数创建不同的实例

example2:简单工厂模式示例
    Factory:简单工厂
    Api:工厂要创建的对象接口
    ImplA,ImplB:具体对象
    简单工厂类中 提供方法,用于创建具体的不同对象

二.外观模式
facade
example2:外观模式的示例
    Facade:门面封装了AmoduleApi,BModuleApi...调用.客户端直接调用Facade中暴露的api即可,简化调用

example3:外观模式在 "生成代码" 的应用
    ConfigManager单例,读取配置文件,生成ConfigModel对象.

    Presentation,Business,Dao类均会判断ConfigModel判断是否要生成代码

    Facade:调用Presentation,Business,Dao类的方法,生成代码
    Client:调用Facade


三.适配器模式
adapter
example1:
    Target:客户端想要的目标接口
    Adaptee:需要被适配的旧接口
    Adapter:适配器类,实现新接口,则需要实现新接口中的方法.持有旧接口对象,在实现的新接口方法中转调旧接口中的方法.

四.单例模式
singleton

五.工厂方法模式
factory method
example2:工厂方法模式 示例
    Product:产品,需要被创建的对象
    ConcreteProduct:产品的一个具体类型

    Creator:工厂方法基类,包含 抽象方法createProduct()用于创建产品.但是具体实现交给各个子类实现
    ConcreteCreator:工厂方法的一个具体实现,实现createProduct()方法


example3:工厂方法模式 应用
    ExportOperate:工厂方法类,提供抽象

example5:一个工厂方法类中Creator,可以包含多个创建不同对象的工厂方法.但是这些工厂方法通常只在当前类中使用,最终不会暴露给客户端

六.抽象工厂模式
abstract factory
提供一个创建 一系列相关或相互依赖对象的接口,而无需指定它们具体的类.
解决的具体问题:1.只知道创建的一系列对象的接口,而不知具体实现(cpu和mainBoard)
          2.这一系列对象是相关或相互依赖的(cpu和mainBoard的针脚应相同)
          即 既要创建接口的对象,还要约束它们之间的关系.

实现:抽象工厂定义了一系列相关的产品,用于创建一系列相关的产品.
   即 抽象工厂基类 定义了一系列 用于创建不同类型对象的抽象方法.各个抽象工厂实现类 根据不同情况在实现时创建具体的不同产品对象

与 简单工厂 或 工厂方法 模式的区别
这两者 只关心创建单个产品类型的对象,如创建CPU的工厂方法只关心如何创建cpu对象.创建主板的工厂方法,只关心如何创建主板对象.
而抽象工厂模式,要创建一系列类型的对象(cpu和主板),最终组成所需的对象(电脑).

抽象工厂接口中定义的工厂方法,延迟到了具体的工厂实现类中实现.

example1:使用 简单工厂 模式 实现 电脑组装
example2:抽象工厂模式的 示例实现
        AbstractFactory:抽象工厂基类,包含创建productA和productB的两个抽象方法
        ConcreteFactory1和ConcreteFactory2:
            抽象工厂类的两个具体实现,均重写了抽象工厂类中的createProductA和createProductB方法
            但是它们,视情况返回创建了不同的productA和productB

example3:抽象工厂模式 实现电脑组装匹配的主板和cpu P136
        AbstractFactory:提供createCPU和createMainboard两种对象的抽象方法
        Schema1和Schema2是两个实现,分别创建"匹配"的cpu和主板

example4:以上的抽象工厂模式 有一个小问题,即若想在抽象工厂接口中添加一种新的产品类型,则需要更改所有实现该接口的实现类(都需要添加该方法)
                           基于此问题提供  可拓展的抽象工厂的实现

example5:支持xml和database等多种数据源的dao 抽象工厂 实现

七.生成器模式
builder
将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示.
生成器 分离了 构建算法 和 具体的构造实现
example2:生成器模式的标准实现
    Director:导演类 持有 builder对象.调用builder.build()方法
    Builder:生成器 类 持有 Product对象.并提供方法创建Prodcut中的具体部分.


example3:生成器模式重写 使用xml和text不同方式导出data中的data头部,data主体,data尾部.

八.原型模式
prototype

example1:订单实例

example2:原型示例

example3:原型重写订单实例:
 发现在OrderBusiness中使用订单接口时,无需再用instanceof判断.

九.中介者模式
Mediator
定义:用一个中介对象 来 封装 一系列的对象交互.中介者使得各对象不需要显式的相互引用.从而使其耦合松散,而且可以独立的改变它们之间的交互.
涉及的两类对象:1.中介类  2.同事类(与中介类交互的其他类)
所有同事类 应 持有 中介类 对象

example1:中介者模式 实例
Mediator:中介者接口,定义了同事类 与 中介者 类 交互的通用方法changed
ConcreteMediator:具体 中介者类.持有每个同事类对象
Colleague:同事类基类,持有 中介者类对象
ConcreteColleagueA,ConcreteColleagueB:同事类 实现

example2:使用中介者模式 实现电脑播放视频功能(其实就是电脑的所有组件 和主板这个中介者 进行交互)

P232描述了example1和example2中这种标准的中介者模式存在的问题.就是中介者对象持有了 同事类对象.同事类对象 中 也 持有了中介者对象.耦合性强
由此提出了 "广义的中介者模式"

example3:广义中介者模式 实现 部门员工关系

十.代理模式
proxy

example2:代理模式示例
    Proxy:代理类,持有被代理类的对象,调用被代理类的方法
    RealSubject:被代理类

example3:代理模式 实现 用户查询大数据量的用户信息(不分页),则第一次只查询所有的id和name,在查看详情时再查询其余的属性(如sex)
    虚代理
    UserModel:被代理类,UserModelApi:被代理接口
    Proxy:代理类,其中id和name属性 直接访问被代理类的
    但是由于第一次没查询其他属性.在获取sex属性时,会先在proxy中查询.再调用具体被代理类中的属性

example4:保护代理.只有该用户创建的订单,该用户才能修改.在代理类中加控制.

example5:java动态代理 重写 上例子

example6:使用子类实现代理.代理类OrderProxy继承自被代理对象Order

十一.观察者模式
observer
定义:定义对象间的一种 一对多的依赖关系.当一个对象的状态发送改变时,所有依赖于它的对象都得到通知并被自动更新.
subject:目标对象1.一个目标可被多个观察者观察;2.目标提供对观察者注册和退订的维护;
    3.当目标的状态发生变化时,目标负责通知所有注册的,有效的观察者.

example1:观察者模式 示例
example2:观察者模式 实现订阅报纸
    观察者模式 两种模型:推模型,拉模型
    推模型:目标对象 主动 向 观察者推送目标的详细信息,无论观察者是否需要,推送的信息通常是目标对象的全部或部分数据,相当于广播通信.
    拉模型:目标对象在通知观察者的时候,只传递少量信息.若观察者需要更具体的信息,由观察者主动到目标对象中获取,
        相当于是观察者从目标对象中拉数据.

example4:使用java.util.Observable接口 实现观察者模式.

十二.命令模式

command
example1
定义:将一个请求封装为一个对象,从而使你可用不同的请求对客户进行参数化,对请求排队或记录请求日志,以及支持可撤销的操作.
Invoker:命令的调用者,持有命令对象(Command)
Command:命令接口
ConcreteCommand:具体的命令,实现Command接口,持有Receiver对象(接收命令者)
Receiver:命令接收者(具体执行命令)

执行顺序:
invoker.runCommand()->command.execute()->receiver.action()

example2:命令模式完成 开机操作
Box:机箱,相当于Invoker(调用者)
Command:命令接口
    实现类:OpenCommand:开机命令
MainBoardApi:主板,相当于 receiver(命令接受者,具体执行命令)
    实现类GigaMainBoard,MsiMainBoard

执行顺序:点机箱上的开机按钮->执行开机命令->调用主板上的开机方法
box.openButtonPressed()->openCommand.execute()->mainBoard.open()

example3:命令模式定义多个实现类(openCommand,ResetCommand)

example4:可撤销的操作
有3种方式可以实现撤销操作:1.补偿式;2.反操作式;3.存储恢复式(存储命令最初的状态,直接恢复)


Command:调用计算机命令
    实现类:AddCommand:excute()调用加法,undo()调用减法
Operation:具体计算机计算的执行类,相当于receiver

### 二十五.访问者模式
180227
visitor
定义:表示 一个 作用于 某对象结构中的 各元素 的 操作,它使你可以在不改变各元素的类 的 前提 下 定义 作用于 这些元素的新操作.
example1 : 不同客户 中 有不同的 serviceRequest方法,即不同的客户请求

example2 : 每种客户都实现父类中的 各种客户请求方法.有些是这种客户不需要的.
这会导致 功能 和 实体类 耦合,每次需要加不同的功能 都需要修改相关的实体类.
如何在不改变客户对象结构中各元素类的前提下，为这些类定义新的功能.
也就是要求不改变企业客户和个人客户类，就能为企业客户和个人客户类定义新的功能.

example3 : 访问者模式的抽象标准实现
解决访问者模式每次都会对所有元素进行访问的问题(因为需要实现访问者接口visitor中的所有方法)
方式1:对不需要的方法进行空实现,如visitor1中的visitElementA()实现为空
方式2:在元素类Element中,进行条件判断,满足再调visitor中的访问方法

example4 : visitor重写的example2需求

example5 : `visitor访问树形结构`

 







