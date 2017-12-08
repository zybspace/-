@jsonignore的作用
  作用是json序列化时将java bean中的一些属性忽略掉,序列化和反序列化都受影响。
  从后台推数据到前台的时候,就会把 @jsonignore修饰过的属性 给忽略掉。


hibernate.ddl-auto节点的配置，这个配置有两种方式去配置，我使用的是通过properties文件去配置：
  配置文件中  spring.jpa.hibernate.ddl-auto=update
  hibernate.ddl.auto节点的值有几个create、create-drop、update、validate、none
  create：每次加载hibernate会自动创建表，以后启动会覆盖之前的表，所以这个值基本不用，严重会导致的数据的丢失。
  create-drop ： 每次加载hibernate时根据model类生成表，但是sessionFactory一关闭，表就自动删除，下一次启动会重新创建。
  update：加载hibernate时根据实体类model创建数据库表，这是表名的依据是@Entity注解的值或者@Table注解的值，sessionFactory关闭表不会删除，且下一次启动会根据实体model更新结构或者有新的实体类会创建新的表。
  validate：启动时验证表的结构，不会创建表
  none：启动时不做任何操作
  
