/* MUDA OS BOTÕES INICIAIS */
$(function(){
	$("#btpesquisa").on({
		mouseenter: function(){$(this).attr('src','../img/igreja_local2_clickd.png');},
		mouseleave: function(){$(this).attr('src','../img/igreja_local2.png');}
	});
});
$(function(){
	$("#btcalendario").on({
		mouseenter: function(){$(this).attr('src','../img/igreja_calendario_clickd.png');},
		mouseleave: function(){$(this).attr('src','../img/igreja_calendario.png');}
	});
});
$(function(){
	$("#btagenda").on({
		mouseenter: function(){$(this).attr('src','../img/igreja_agenda_clickd.png');},
		mouseleave: function(){$(this).attr('src','../img/igreja_agenda.png');}
	});
});

/* ------------ INSERÇÃO DE DICAS ------------ */
$( function() {
	$( document ).tooltip({
		position: {
			my: "center bottom-15",
			at: "center top",
			using: function( position, feedback ) {
				$( this ).css( position );
				$( "<div>" )
					.addClass( "arrow" )
					.addClass( feedback.vertical )
					.addClass( feedback.horizontal )
					.appendTo( this );
			}
		}
	});
 });
/* ---------- FIM INSERÇÃO DE DICAS ---------- */