<<<<<<< HEAD
﻿function CalendarInit() {
=======
﻿function CalendarInit() {
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
    "use strict";

    var date = new Date();
    var d = date.getDate();
    var m = date.getMonth();
    var y = date.getFullYear();

    var hdr = {};

<<<<<<< HEAD
    if ($(window).width() <= 767) {
        hdr = { left: 'title', center: '', right: 'prev,today,month,agendaWeek,agendaDay,next' };
    } else {
        hdr = { left: '', center: 'title', right: 'prev,today,month,agendaWeek,agendaDay,next' };
=======
    if ($(window).width() <= 767) {
        hdr = { left: 'title', center: '', right: 'prev,today,month,agendaWeek,agendaDay,next' };
    } else {
        hdr = { left: '', center: 'title', right: 'prev,today,month,agendaWeek,agendaDay,next' };
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
    }

    var initDrag = function (e) {
        // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
        // it doesn't need to have a start or end



<<<<<<< HEAD
        var eventObject = {
=======
        var eventObject = {
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
            title: $.trim(e.text()), // use the element's text as the event title

            className: $.trim(e.children('span').attr('class')) // use the element's children as the event class
        };
        // store the Event Object in the DOM element so we can get to it later
        e.data('eventObject', eventObject);

        // make the event draggable using jQuery UI
<<<<<<< HEAD
        e.draggable({
            zIndex: 999,
            revert: true, // will cause the event to go back to its
            revertDuration: 0  //  original position after the drag
        });
    };

    var addEvent = function (title, priority) {
=======
        e.draggable({
            zIndex: 999,
            revert: true, // will cause the event to go back to its
            revertDuration: 0  //  original position after the drag
        });
    };

    var addEvent = function (title, priority) {
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
        title = title.length === 0 ? "Untitled Event" : title;

        priority = priority.length === 0 ? "label label-default" : priority;

        var html = $('<li class="external-event"><span class="' + priority + '">' + title + '</span></li>');

        jQuery('#external-events').append(html);
<<<<<<< HEAD
        initDrag(html);
=======
        initDrag(html);
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
    };

    /* initialize the external events
     -----------------------------------------------------------------*/

<<<<<<< HEAD
    $('#external-events li.external-event').each(function () {
        initDrag($(this));
    });

    $('#add-event').click(function () {
        var title = $('#title').val();
        var priority = $('input:radio[name=priority]:checked').val();

        addEvent(title, priority);
=======
    $('#external-events li.external-event').each(function () {
        initDrag($(this));
    });

    $('#add-event').click(function () {
        var title = $('#title').val();
        var priority = $('input:radio[name=priority]:checked').val();

        addEvent(title, priority);
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
    });
    /* initialize the calendar
     -----------------------------------------------------------------*/

<<<<<<< HEAD
    $('#calendar').fullCalendar({
        header: hdr,
        buttonText: {
            prev: '<i class="icon-chevron-left"></i>',
            next: '<i class="icon-chevron-right"></i>'
=======
    $('#calendar').fullCalendar({
        header: hdr,
        buttonText: {
            prev: '<i class="icon-chevron-left"></i>',
            next: '<i class="icon-chevron-right"></i>'
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
        },
        editable: true,
        droppable: true, // this allows things to be dropped onto the calendar !!!
        drop: function (date, allDay) { // this function is called when something is dropped

            // retrieve the dropped element's stored Event Object
            var originalEventObject = $(this).data('eventObject');

            // we need to copy it, so that multiple events don't have a reference to the same object
            var copiedEventObject = $.extend({}, originalEventObject);

            // assign it the date that was reported
            copiedEventObject.start = date;
            copiedEventObject.allDay = allDay;

            // render the event on the calendar
            // the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
            $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);


            // is the "remove after drop" checkbox checked?
            if ($('#drop-remove').is(':checked')) {
                // if so, remove the element from the "Draggable Events" list
<<<<<<< HEAD
                $(this).remove();
            }

        },
        windowResize: function (event, ui) {
            $('#calendar').fullCalendar('render');
        }
    });
=======
                $(this).remove();
            }

        },
        windowResize: function (event, ui) {
            $('#calendar').fullCalendar('render');
        }
    });
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
}