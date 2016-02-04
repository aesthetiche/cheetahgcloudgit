var cheetah_r = angular.module('cheetah_r', []);

cheetah_r.controller('my1c', function($scope,$timeout) {
    $scope.name = "Ajay Malik";
    $scope.occupation = "Coder";
    $scope.getStatus = function() {
        console.log(this.name + ' ' + this.occupation);
    };
    $scope.getStatus();
    $timeout(function(){
        $scope.name = "Mr. Coder";
    },3000)
    
    console.log($scope);
});
