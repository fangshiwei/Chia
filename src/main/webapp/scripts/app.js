(function () {

    angular
        .module('Chia', [
            //'ngSanitize',
            'angular-carousel-3d',
            'ui.router',
            'infinite-scroll',
            'slick',
            'dm.stickyNav'
        ])
        .controller('AppController', AppController);

    AppController.$inject = ['$scope', '$timeout', '$location', '$anchorScroll',];

    function AppController($scope, $timeout, $location, $anchorScroll) {

        $scope.sectionLocations = [];// 锚点的位置数据
        //$scope.scrollTop = 0;// 边界值
        //$scope.scrollBottom = 0; // 边界值
        //$scope.lastScrollTop = 0;// 最后一次滚动的位置
        $scope.activeNavBtn = 'vvl-top'; // 默认激活 button

        //初始化锚点数据
        (function initSectionLocations() {
            var sections = $("ng-include.section");
            // 解决 ng-include 加载延时与 jQuery.onload 不同步的问题
            if (sections.size() < 5) {
                $timeout(function () {
                    initSectionLocations();
                }, 100);
                return;
            }
            // 遍历所有 section 获取位置信息
            sections.each(function () {
                $scope.sectionLocations.push({
                    id: $(this).attr('id'),
                    top: $(this).position().top,
                    bottom: $(this).position().top + $(this).height()
                });
            });

            console.log(angular.toJson($scope.sectionLocations, true));


        })();

        // GOTO
        $scope.goto = function (elemId) {
            if ($scope.sectionLocations.length == 0) return;
            // set the location.hash to the id of the element you wish to scroll to.
            //$location.hash(elemId);
            // call $anchorScroll()
            //$anchorScroll();
            console.log('goto:', '#' + elemId);
            $scope.activeNavBtn = elemId;
            angular.forEach($scope.sectionLocations, function (value, key) {
                if (value.id == elemId) {
                    $("html, body").stop().animate({scrollTop: value.top}, 1000);
                }
            });

        };

        // 根据窗口滚动位置，刷新导航条
        $(window).scroll(function () {
            if ($scope.sectionLocations.length == 0) return;
            var scrollTop = $(window).scrollTop();
            var windowHeight = $(window).height();
            var docHeight = $(document).height();
            //console.log('window.scrollTop:', scrollTop);
            //console.log('window.height:', windowHeight);
            //console.log('document.height:', docHeight);

            // 如果到达窗口底部，选中最后一个导航按钮
            console.log(scrollTop + windowHeight);
            console.log($scope.sectionLocations[$scope.sectionLocations.length-1].bottom);

            if (scrollTop + windowHeight >= docHeight) {
                $scope.activeNavBtn = $scope.sectionLocations[$scope.sectionLocations.length-1].id;
            } else {
                // 根据scrollTop在哪个section区间，激活导航按钮
                angular.forEach($scope.sectionLocations, function (value, key) {
                    if (scrollTop >= value.top) {
                        $scope.activeNavBtn = value.id;
                    }
                });
            }
        });

        //
        $scope.slides = [
            {caption: '孕妇妈妈'},
            {caption: '通便排毒'},
            {caption: '纤体美颜'},
            {caption: '健康达人'},
            {caption: '素食主义'},
            {caption: '天使宝贝'},
            {caption: '青春少年'},
        ];

        $scope.options = {
            visible: 7,
            perspective: 35,
            startSlide: 0,
            border: 2,
            dir: 'ltr',
            width: 418,
            height: 577,
            space: 290,
            // controls: true
        };

        /////////////////////
        // user case
        ///////////////////
        $scope.userCaseList = [
            {id: 'userCase-2', src: 'style/images/img2.png'},
            {id: 'userCase-3', src: 'style/images/img3.png'},
            {id: 'userCase-4', src: 'style/images/img4.png'},
            {id: 'userCase-5', src: 'style/images/img5.png'},
            {id: 'userCase-6', src: 'style/images/img.png'},
        ];
        $scope.slick = {
            slickGoTo: function (elementId, index, animate) {
                console.log('....goto: ' + elementId);
                $('#' + elementId).slick('slickGoTo', index, animate);
                $scope.slick.currentIndex = index;
            },
            slickCurrentSlide: function (elementId) {
                return $('#' + elementId).slick('slickCurrentSlide');
            },
            slickNext: function (elementId) {
                $('#' + elementId).slick('slickNext');
            },
            slickPrev: function (elementId) {
                $('#' + elementId).slick('slickPrev');
            },
            currentIndex: 0
        }

        $timeout(function () {
            $('#usercase').on('afterChange', function (event, slick, currentSlide) {
                $scope.$apply($scope.slick.currentIndex = currentSlide);

            });
        });

    }

})();

$(function () {
    // stick header
    /////////////////////////
    var lastScrollTop = $(document).scrollTop();
    var headerHeight = $('.sticky-header').outerHeight();

    $(window).scroll(function () {
        var scrollTop = $(document).scrollTop();

        if (scrollTop > headerHeight) {
            $('.sticky-header').addClass('hide-sticky-header');
            $('.sticky-header').removeClass('ticky-header-static-bg');
            $('.sticky-header').addClass('ticky-header-dynamic-bg');
        } else {
            $('.sticky-header').removeClass('hide-sticky-header');
            $('.sticky-header').removeClass('ticky-header-dynamic-bg');
            $('.sticky-header').addClass('ticky-header-static-bg');
        }

        if (scrollTop > lastScrollTop) {
            $('.sticky-header').removeClass('show-sticky-header');
        } else {
            $('.sticky-header').addClass('show-sticky-header');
        }

        lastScrollTop = $(document).scrollTop();
    });
});