package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class n5f extends SSLSocketFactory {
    public final String[] a;
    public final SSLSocketFactory b;

    public n5f(String[] strArr) throws NoSuchAlgorithmException, KeyManagementException {
        this.a = strArr;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        socketFactory.getClass();
        this.b = socketFactory;
    }

    public final void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.a);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        socket.getClass();
        str.getClass();
        Socket socketCreateSocket = this.b.createSocket(socket, str, i, z);
        socketCreateSocket.getClass();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.b.getDefaultCipherSuites();
        defaultCipherSuites.getClass();
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.b.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.b.createSocket();
        socketCreateSocket.getClass();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        str.getClass();
        Socket socketCreateSocket = this.b.createSocket(str, i);
        socketCreateSocket.getClass();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        str.getClass();
        inetAddress.getClass();
        Socket socketCreateSocket = this.b.createSocket(str, i, inetAddress, i2);
        socketCreateSocket.getClass();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        inetAddress.getClass();
        Socket socketCreateSocket = this.b.createSocket(inetAddress, i);
        socketCreateSocket.getClass();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket socketCreateSocket = this.b.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.getClass();
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
