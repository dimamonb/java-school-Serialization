package classwork.params.entity.template.v1;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.io.Serializable;
import java.util.List;

public class Fallback implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Override
    public String toString() {
        return "Fallback{" +
                       "parameters=" + parameters +
                       '}';
    }
    
    public List<Parameter> parameters;

    public List<Parameter> getParameters() {
        return parameters;
    }
    @JsonGetter("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
