package com.cyxd.zook.demo2;

public interface DataMonitorListener {
	/**
	 * The existence status of the node has changed.
	 */
	void exists(byte data[]);

	/**
	 * The ZooKeeper session is no longer valid.
	 * 
	 * @param rc
	 *            the ZooKeeper reason code
	 */
	void closing(int rc);
}