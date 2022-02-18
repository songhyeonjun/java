<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['하는일', '시간'],
          ['수업', 8],
          ['식사', 3],
          ['이동', 2],
          ['운동', 1],
          ['잠', 7],
          ['여가시간', 3]
        ]);

        var options = {
          title: '일상'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="piechart" style="width: 300px; height: 300px;"></div>
  </body>
</html>
['Month', '시간급',  '인상률'],
          ['2015',  5,580,      7.1],
          ['2016',  6,030,      8.1],
          ['2017',  6,470,      7.3],
          ['2018',  7,530,      16.4],
          ['2029',  8,530,      10.9]