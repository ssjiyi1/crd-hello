/**
 *  student 相关 dom
 */


(function($){

    /**
     *  查询所有的学生列表
     */
    function listStudent(){
        $.GetHttp("/dubbo/student/listAll",function(data,status){
            console.info(data + "---" + status);
        });
    };


    //  init
  $(function(){
        // 初始化学生列表
      listStudent();

  });


})(jQuery);

