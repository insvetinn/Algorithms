# Algorithms

## 分析算法的模板

### 算法名称(英文)

算法名称(中文)

> 伪代码
>
> 0. ...
> 1. ...
> 2. ...
> 3. ...

> 图示
>
> // 待补...

> 分析
>
> 1. ...
> 2. ...

> 特点
>
> 1. ...
> 2. ...

> 源代码
>
> ```Java
> // 待补充...
> ```



## Sort

排序

> 将(一般是随机排布的)数据按照升序排序. 

辅助方法

> less() 比较两个数据的大小
>
> swap() 交换两个数据的位置

Sort 模板(抽象类)中写辅助方法, 封装输入处理输出的 process() 和留空用于重写的 sort(). 具体的排序算法继承 Sort 模板, 仅仅重写 sort() 中的算法. 

Comparable 接口

> 处理各种数字和字母(按照 ASCII 值). 
>
> 用 compareTo() 自定义数据类型的自然次序(即元素的大小关系)
>
> 自然次序应实现元素间关系的自反, 反对称和传递

输入

> txt file --> ArrayList --> Comparable[]

输出

> Comparable[] --> Display

算法的衡量指标

> 1. 运行时间
>
> 	​	在不同的随机输入下, 基本操作的次数. 
>
> 	​	基本操作: 比较, 交换, 访问数组, 读写数组
>
> 	​	排序成本模型: 比较和交换的数量(不交换元素则计算访问数组的次数)
>
> 	​	// TODO: Apr 16, 2022 大 O 标记法...
>
> 2. 额外的内存占用
>
> 	​	原地排序算法: 除了方法调用所需的栈和固定数目的实例变量, 不需要额外内存占用
>
> 	​	其他排序算法: 需要额外内存占用来存储一个数组的副本
>
> 3. 支持的数据类型
>
> 	​	Comparable: 数字和字母



// TODO: Apr 16, 2022 用 Java 实现一个像素画面的扑克牌游戏...

> // 目前估计会用到的东西和需要做的事情: 
>
> // 	1. 算法
>
> // 	2. GUI(JavaFX)
>
> // 	3. 数据库(JDBC) 
>
> // 	4. 多线程
>
> // 	5. 画面, 即美术素材(Aseprite)
>
> // 	6. 音乐, 在日本音乐素材网站上找
>
> // 	7. (也许有?)通讯(servlet), 联机, 联网
>
> // 	8. 一些细节(支持的语言, 自定义界面风格, 播放音乐时在右上角显示名称, 作者和来源地址, 字体使用现在的字体(ZHO Pixel Code, Zpix)等等)
>
> // 	9. 致谢, 标注使用的工具, 素材等, 在 GitHub 上公布源码并打包好可执行文件, 开源证书, 版本号, 版本管理等等
>
> // 	10. 了解游戏规则



### SelectionSort

选择排序

> 伪代码
>
> 0. 整个数组是未排序区; 
> 1. 在未排序区内选择最小的元素, 和未排序区第一个元素交换位置;
> 2. 在逻辑上将这个最小的元素划出未排序区, 划入排序区; 
> 3. 反复执行步骤 1, 2, 直到整个数组是排序区;

> 图示
>
> // 待补...

> 分析
>
> 1. 原理最简单; 
>
> 2. 数组长度为 N, 选择排序需要 (N ^ 2 / 2) 次比较和 N 次交换. 
>
> 	​	数学证明 待补...

> 特点
>
> 1. 运行时间与输入(的数组的初始状态)无关
> 2. 数据移动(次数)最少

> 源代码
>
> ```Java
> int N = array.length;
> for (int i = 0; i < N; i++) {
> 				int min = i;
>      	 for (int j = i + 1; j < array.length; j++) {
>        					if (less(array[j], array[min])) {
>                					min = j;
>                       	}
>               	}
>               	swap(array, i, min);
> }
> ```



### InsertionSort

> 算法名称(中文)
>
> > 伪代码
> >
> > 0. ...
> > 1. ...
> > 2. ...
> > 3. ...
>
> > 图示
> >
> > // 待补...
>
> > 分析
> >
> > 1. ...
> > 2. ...
>
> > 特点
> >
> > 1. ...
> > 2. ...
>
> > 源代码
> >
> > ```Java
> > int N = array.length;
> > for (int i = 0; i < N; i++) {
> > 				for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
> >                	swap(array, j, j - 1);
> >    			}
> > }
> > ```
>