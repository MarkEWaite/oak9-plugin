package io.jenkins.plugins.oak9.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "requirementId",
        "requirementName",
        "source",
        "resourceName",
        "resourceId",
        "resourceType",
        "oak9Guidance",
        "violations"
})
@Generated("jsonschema2pojo")
public class DesignGap {

    @JsonProperty("requirementId")
    private String requirementId;
    @JsonProperty("requirementName")
    private String requirementName;
    @JsonProperty("source")
    private String source;
    @JsonProperty("resourceName")
    private Object resourceName;
    @JsonProperty("resourceId")
    private Object resourceId;
    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("oak9Guidance")
    private Object oak9Guidance;
    @JsonProperty("violations")
    private List<Violation> violations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public DesignGap() {
    }

    /**
     *
     * @param requirementName
     * @param resourceId
     * @param violations
     * @param resourceName
     * @param source
     * @param requirementId
     * @param oak9Guidance
     * @param resourceType
     */
    public DesignGap(String requirementId, String requirementName, String source, Object resourceName, Object resourceId, String resourceType, Object oak9Guidance, List<Violation> violations) {
        super();
        this.requirementId = requirementId;
        this.requirementName = requirementName;
        this.source = source;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.oak9Guidance = oak9Guidance;
        this.violations = violations;
    }

    @JsonProperty("requirementId")
    public String getRequirementId() {
        return requirementId;
    }

    @JsonProperty("requirementId")
    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    @JsonProperty("requirementName")
    public String getRequirementName() {
        return requirementName;
    }

    @JsonProperty("requirementName")
    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("resourceName")
    public Object getResourceName() {
        return resourceName;
    }

    @JsonProperty("resourceName")
    public void setResourceName(Object resourceName) {
        this.resourceName = resourceName;
    }

    @JsonProperty("resourceId")
    public Object getResourceId() {
        return resourceId;
    }

    @JsonProperty("resourceId")
    public void setResourceId(Object resourceId) {
        this.resourceId = resourceId;
    }

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("oak9Guidance")
    public Object getOak9Guidance() {
        return oak9Guidance;
    }

    @JsonProperty("oak9Guidance")
    public void setOak9Guidance(Object oak9Guidance) {
        this.oak9Guidance = oak9Guidance;
    }

    @JsonProperty("violations")
    public List<Violation> getViolations() {
        return violations;
    }

    @JsonProperty("violations")
    public void setViolations(List<Violation> violations) {
        this.violations = violations;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}