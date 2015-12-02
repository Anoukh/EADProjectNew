<<<<<<< HEAD
﻿$(function () {
    
    $('.list-inline li > a').click(function () {
=======
﻿$(function () {
    
    $('.list-inline li > a').click(function () {
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
        var activeForm = $(this).attr('href') + ' > form';
        //console.log(activeForm);
        $(activeForm).addClass('magictime swap');
        //set timer to 1 seconds, after that, unload the magic animation
<<<<<<< HEAD
        setTimeout(function () {
            $(activeForm).removeClass('magictime swap');
        }, 1000);
=======
        setTimeout(function () {
            $(activeForm).removeClass('magictime swap');
        }, 1000);
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
    });
});