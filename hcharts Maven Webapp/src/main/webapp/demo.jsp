<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<%@page isELIgnored="false" %> 
<!-- 是否忽略EL表达式,true则是忽略 -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>柱形图与表格展示</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <style media="screen">
        #datatable {
      border: 1px solid #ccc;
      border-collapse: collapse;
      border-spacing: 0;
      font-size: 12px;
      }

      td,th {
      border: 1px solid #ccc;
      padding: 4px 20px;
      }

      h3,p,.btn-group,table{
        margin: 15px;
      }

    </style>


  </head>
  <body>
    <h3>
        <span style="color: #95ceff;">投诉处理及时率</span> 趋势分析
    </h3>
    <p>结论：9月份投诉处理及时率为98.0%，与上月（97.4%）比提升0.6%，与去年同期（98.6%）比下降0.6%。</p>
    <div class="btn-group pull-right">
      <button id="Txing" type="" class="btn btn-info">图形</button>
      <button id="Tbiao" type="" class="btn btn-info">图表</button>
    </div>
    <div id="container" style="min-width: 310px; height: 400px; margin: 0 auto;"></div>
    <table id="datatable" style="display: none;">
        <thead>
            <tr style="background-color: #95ceff;">
                <th></th>
                <th>1月</th>
                <th>2月</th>
                <th>3月</th>
                <th>4月</th>
                <th>5月</th>
                <th>6月</th>
                <th>7月</th>
                <th>8月</th>
                <th>9月</th>
                <th>10月</th>
                <th>11月</th>
                <th>12月</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>上年</th>
                <td>98.0%</td>
                <td>97.0%</td>
                <td>97.0%</td>
                <td>97.3%</td>
                <td>97.8%</td>
                <td>97.8%</td>
                <td>97.6%</td>
                <td>97.7%</td>
                <td>98.6%</td>
                <td>98.5%</td>
                <td>98.8%</td>
                <td>98.6%</td>
            </tr>
            <tr>
                <th>本年</th>
                <td>98.7%</td>
                <td>98.9%</td>
                <td>98.6%</td>
                <td>98.6%</td>
                <td>98.5%</td>
                <td>98.5%</td>
                <td>98.3%</td>
                <td>97.4%</td>
                <td>98.0%</td>
                <td></td>
                <td></td>
                <td></td>

            </tr>
          </tbody>
        </table>
      </body>
</html>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js "></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js "></script>
<script src="http://cdn.hcharts.cn/highcharts/highcharts.js "></script>
<script src="http://cdn.hcharts.cn/highcharts/modules/exporting.js "></script>
<script src="http://cdn.hcharts.cn/highcharts/modules/data.js "></script>
<script type="text/javascript">
// $(document).ready(function(){
//
// });
  $(function () {
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '数据'
        },

        xAxis:{
            categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']},
        yAxis: {  
          min: 96.0,   
          labels: {//y轴刻度文字标签  
            formatter: function () {  
             return this.value + '%';//y轴加上%  
              }  
            },                
         },  
        credits: {  
          enabled: false//右下角图表版权信息不显示  
                },  
        tooltip: {  
          valueSuffix: '%'//标示框后缀加上%  
                },  
        plotOptions: {
          column: {
            borderWidth: 0
            }
        },
        series: [{
              name: '上年',
              data: [98.0, 97.0, 97.0 ,97.3, 97.8, 97.8, 97.6, 97.7, 98.6, 98.5, 98.8, 98.6]
            },{
              name: '本年',
              data: [98.7, 98.9, 98.6, 98.6, 98.5, 98.5, 98.3, 97.4, 98.0]
            }]
          });
          $("#Txing").click(function(){
            $("#container").css("display",""),
            $("#datatable").css("display","none")
          });
          $("#Tbiao").click(function(){
            $("#container").css("display","none"),
            $("#datatable").css("display","")
          });

    });
</script>
