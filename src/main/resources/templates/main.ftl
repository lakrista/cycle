<header id="page-header">
    <div class="row"></div>
</header>
<main>
    <section id="page-content">
        <div class="row">
            <div class="small-11 small-centered columns">
                <div class="row">
                    <a ng-click="getAllNotes()" class="button radius">Load All Notes</a>
                    <ul ng-if="notes" class="circle">
                        <li ng-repeat="note in notes" ng-include="'notes_renderer.html'"></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
</main>
<footer></footer>

<script type="text/ng-template" id="notes_renderer.html">
    <span>{{note.title}}</span>
</script>