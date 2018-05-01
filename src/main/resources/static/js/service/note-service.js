'use strict';

angular.module('cycleApp').factory('NoteService',
    ['$http', '$q',
        function ($http, $q) {

            let factory = {
                loadAllNotes: loadAllNotes,
            };

            return factory;

            function loadAllNotes() {
                let deferred = $q.defer();
                $http.get(SERVICE_API + 'notes')
                    .then(
                        response => {
                            deferred.resolve(response);
                        },
                        errResponse => {
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

        }
    ]);