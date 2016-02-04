var cheetahApp = angular.module('cheetahApp',[]);

cheetahApp.controller('my1C',function($scope) {
    $scope.name = 'ajay malik';
    $scope.profession = 'Coder';
    $scope.getPro = function() {
        
        return $scope.profession;
    }
    
});