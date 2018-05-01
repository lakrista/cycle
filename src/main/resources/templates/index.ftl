<!DOCTYPE html>

<html lang="en" ng-app="cycleApp">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="initial-scale=1.0, width=device-width">
    <title>${title}</title>
    <link rel="stylesheet" href="css/foundation.min.css">
    <link rel="stylesheet" href="css/app.css"/>
</head>
<body>
    <div ui-view></div>
    <script src="js/lib/angular.min.js" ></script>
    <script src="js/lib/angular-ui-router.min.js" ></script>
    <script src="js/lib/jquery.js"></script>
    <script src="js/lib/foundation.min.js"></script>
    <script src="js/app.js"></script>
    <script src="js/constant.js"></script>
    <script src="js/common.js"></script>
    <script src="js/controller/main-controller.js"></script>
    <script src="js/service/note-service.js"></script>
</body>
</html>