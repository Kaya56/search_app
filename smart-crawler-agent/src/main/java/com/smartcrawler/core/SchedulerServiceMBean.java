package com.smartcrawler.core;

/**
 * Interface MBean pour les métriques JMX de SchedulerService.
 */
public interface SchedulerServiceMBean {
    int getQueueSize();
    int getActiveCrawls();
}
