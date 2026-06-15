package cn.bugstack.domain.ssh.adapter.port;

public interface ISshSessionPort {

    boolean connect(String connectionId, String host, int port, String username, String password, String privateKey);

    boolean isConnect(String connectionId);

    void disConnect(String connectionId);
}
