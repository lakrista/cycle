'use strict';

angular.module('cycleApp').controller('MainController',
    ['$scope', 'NoteService',  function($scope, NoteService) {

        let self = this;
        self.notes = [];
        self.getAllNotes = getAllNotes;

        function getAllNotes(){
            self.notes = NoteService.loadAllNotes();
            console.log('Load notes');
        }
    }
    ]);