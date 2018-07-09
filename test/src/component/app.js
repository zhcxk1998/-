import React from 'react';

class Home extends React.Component {
    render() {
        return (
            <div>
                <h2>HELLO</h2>
                <p>Cras facilisis urna ornare ex volutpat, et convallis erat elementum. Ut aliquam,
                    ipsum vitae gravida suscipit, metus dui bibendum est, eget rhoncus nibh metus nec massa. Maecenas
                    hendrerit laoreet augue nec molestie. Cum sociis natoque penatibus et magnis dis parturient montes,
                    nascetur ridiculus mus.</p>
                <p>Duis a turpis sed lacus dapibus elementum sed eu lectus.</p>
            </div>
        );
    }
}

class Index extends React.Component {
    render() {
        return (
            <div>
                <h1>Simple SPA</h1>
                <ul className="header">
                    <li>Home</li>
                    <li>Stuff</li>
                    <li>Contact</li>
                </ul>
                <div className="content">
                    <Home/>
                </div>
            </div>
        );
    }
}

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




class App extends React.Component {
    render() {
        return (
            <Index/>
        );
    }
}

export default App;