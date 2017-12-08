@jsonignore的作用
  作用是json序列化时将java bean中的一些属性忽略掉,序列化和反序列化都受影响。
  从后台推数据到前台的时候,就会把 @jsonignore修饰过的属性 给忽略掉。
