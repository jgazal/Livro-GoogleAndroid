package br.com.livroandroid.cap27.playermp3service;

//Interface para fazer o bind do Service MediaPlayerService que a implementa

public interface InterfaceMp3 {
	// Inicia a musica
	void play(String mp3);
	// Faz pause da musica
	void pause();
	// Para a musica
	void stop();
	// true se esta tocando
	boolean isPlaying();
	// Caminho da musica
	String getMp3();
}
