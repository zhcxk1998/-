import React from 'react';

class Form extends React.Component {
    constructor(props) {
        super(props);
        this.state = {value: 'Hello'};
        // this.handleChange=this.handleChange.bind(this);
    }

    handleChange(event) {
        this.setState({
            value: event.target.value
        });
    }

    render() {
        var value = this.state.value;
        return (
            <div>
                <input type="text" value={value} onChange={this.handleChange.bind(this)}/>
                <p>{value}</p>
            </div>
        );
    }
}

export default Form;