public class BrokenBrakeException extends RuntimeException { //Se si usa una runtimeException il programma compila comunque e va volutamente in crash
    //nel momento in cui viene avviata l'eccezione. Con Exception e basta invece si comunica che questa eccezione deve essere gestita e si scarica la responasibilità chi la deve gestire.

    public BrokenBrakeException() {
    }
}
