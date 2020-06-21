package com.zc.l08composite;

/**
 * @author flyingzc
 * 组合模式 将 direcory和leaf统一接口为component.组合模式 对象结构是递归的
 */
public class TestComposite {
    public static void main(String[] args) {
        Directory dirOne = new Directory("dir01" ),
                dirTwo = new Directory("dir02" ),
                dirThr = new Directory("dir03" );
        LeafFile a = new LeafFile("a.txt" ),
                b = new LeafFile("b.txt" ),
                c = new LeafFile("c.txt" ),
                d = new LeafFile("d.txt" ),
                e = new LeafFile("e.txt" );
        dirOne.add(a).add(dirTwo).add(b);
        dirTwo.add(c).add(d).add(dirThr);
        dirThr.add(e);
        dirOne.printFileTree();
    }
}
