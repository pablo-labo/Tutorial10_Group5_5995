package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class fne extends vv0 {
    public final Socket m;

    public fne(Socket socket) {
        this.m = socket;
    }

    @Override // defpackage.vv0
    public final void k() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!c0h.z(e)) {
                throw e;
            }
            ppa.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            ppa.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
